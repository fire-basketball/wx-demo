package com.ligh.wxdemo;

import com.ligh.wxdemo.domain.Area;
import com.ligh.wxdemo.mapper.AreaMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by ${ligh} on 2019/1/10 下午4:27
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AreaDaoTest {

    @Autowired
    private AreaMapper areaMapper;

    @Test
    public void test1(){
        Area area = areaMapper.selectByPrimaryKey(1);
        System.out.println(area.getAreaName());
    }
}
