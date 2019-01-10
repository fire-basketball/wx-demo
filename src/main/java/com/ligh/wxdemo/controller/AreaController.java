package com.ligh.wxdemo.controller;

import com.ligh.wxdemo.domain.Area;
import com.ligh.wxdemo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by ${ligh} on 2019/1/10 下午4:32
 */
@RestController
@RequestMapping("area")
public class AreaController {

    @Autowired
    private AreaService areaService;

    /**
     *  查询所有信息
     *
     * @return
     */
    @RequestMapping(value = "queryAll",method = RequestMethod.GET)
    public Map<String,Object> queryAll(){
        Map<String, Object> map = new ConcurrentHashMap<>();
        List<Area> areas = areaService.queryArea();
        map.put("areaList",areas);
        return map;
    }

    /**
     *  根据id查询
     *
     * @param areaId
     * @return
     */
    @RequestMapping(value = "queryById",method = RequestMethod.GET)
    public Map<String,Object> queryById(Integer areaId){
        Map<String, Object> map = new ConcurrentHashMap<>();
        Area area = areaService.queryAreaById(areaId);
        map.put("area",area);
        return map;
    }

    /**
     *  添加area信息
     *
     * @param area
     * @return
     */
    @RequestMapping(value = "addArea",method = RequestMethod.POST)
    public Map<String,Object> addArea(@RequestBody Area area){
        Map<String, Object> map = new ConcurrentHashMap<>();
        map.put("success",areaService.insertArea(area));
        return map;
    }

    /**
     *  修改area信息
     *
     * @param area
     * @return
     */
    @RequestMapping(value = "modifyArea",method = RequestMethod.POST)
    public Map<String,Object> modifyArea(@RequestBody Area area){
        Map<String, Object> map = new ConcurrentHashMap<>();
        map.put("success",areaService.updateArea(area));
        return map;
    }

    /**
     *  删除area信息
     *
     * @param areaId
     * @return
     */
    @RequestMapping(value = "removeArea",method = RequestMethod.GET)
    public Map<String,Object> removeArea(Integer areaId){
        Map<String, Object> map = new ConcurrentHashMap<>();
        map.put("success",areaService.deleteArea(areaId));
        return map;
    }

}
