package com.ligh.wxdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan({"com.ligh.wxdemo.mapper"})
public class WxDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WxDemoApplication.class, args);
	}

}

