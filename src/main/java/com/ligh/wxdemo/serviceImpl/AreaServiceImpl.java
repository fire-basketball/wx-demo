package com.ligh.wxdemo.serviceImpl;

import com.ligh.wxdemo.domain.Area;
import com.ligh.wxdemo.domain.AreaExample;
import com.ligh.wxdemo.mapper.AreaMapper;
import com.ligh.wxdemo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by ${ligh} on 2019/1/10 下午4:20
 */

@Service
@Transactional
public class AreaServiceImpl implements AreaService{

    @Autowired
    private AreaMapper areaMapper;

    @Override
    public List<Area> queryArea() {
        AreaExample example = new AreaExample();
        example.createCriteria();
        List<Area> areas = areaMapper.selectByExample(example);
        return areas;
    }

    @Override
    public Area queryAreaById(int areaId) {
        return areaMapper.selectByPrimaryKey(areaId);
    }

    @Override
    public boolean insertArea(Area area) {
        if(area.getAreaName()==null && !"".equals(area.getAreaName())){
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            try{
                int i = areaMapper.insertSelective(area);
                if(i>0){
                    return true;
                }else {
                    throw new RuntimeException("插入信息失败!");
                }
            }catch (Exception e){
                throw new RuntimeException("插入数据失败了!"+e.toString());
            }
        }else {
            throw  new RuntimeException("传入areaName信息为空!");
        }

    }

    @Override
    public boolean updateArea(Area area) {
        if(area.getAreaId()==null && !"".equals(area.getAreaId())){
            area.setLastEditTime(new Date());
            int i = areaMapper.updateByPrimaryKeySelective(area);
            try{
                if(i>0){
                    return true;
                }else {
                    throw new RuntimeException("更新信息失败!");
                }
            }catch (Exception e){
                throw new RuntimeException("更新区域失败了!"+e.toString());
            }
        }else {
            throw  new RuntimeException("传入areaId信息为空!");
        }
    }

    @Override
    public boolean deleteArea(int areaId) {
        if(areaId>0){
            int i = areaMapper.deleteByPrimaryKey(areaId);
            try{
                if(i>0){
                    return true;
                }else {
                    throw new RuntimeException("删除信息失败!");
                }
            }catch (Exception e){
                throw new RuntimeException("删除信息失败了!"+e.toString());
            }
        }else {
            throw  new RuntimeException("传入areaId信息为空!");
        }
    }
}
