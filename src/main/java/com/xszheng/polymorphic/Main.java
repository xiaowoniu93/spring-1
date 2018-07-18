package com.xszheng.polymorphic;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xszheng.polymorphic.impl.EBaiOutwayApi;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		EBaiOutwayApi eBaiOutwayApi = (EBaiOutwayApi) ctx.getBean("eBaiOutwayApi");
		System.out.println(eBaiOutwayApi.getPlatform());
		
		// 获取实现 OutwayApi 接口的类，并作为bean 注入到了 IOC 容器中。Map 中的key 为 bean 名称，value 为实现类对象
		Map<String, OutwayApi> beansMap = ctx.getBeansOfType(OutwayApi.class);
		System.out.println(beansMap);
	}
}
