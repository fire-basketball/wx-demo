package com.ligh.wxdemo.service;

import com.ligh.wxdemo.domain.Area;

import java.util.List;

/**
 * Created by ${ligh} on 2019/1/10 下午4:19
 */
public interface AreaService {

    List<Area> queryArea();

    Area queryAreaById(int areaId);

    boolean insertArea(Area area);

    boolean updateArea(Area area);

    boolean deleteArea(int areaId);

}
