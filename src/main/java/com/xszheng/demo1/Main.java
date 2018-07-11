package com.xszheng.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// 1、创建 spring 的 IOC 容器
		// ApplicationContext 代表 IOC 容器
		// ClassPathXmlApplicationContext 是 ApplicationContext 的实现类，表示从类路径下加载配置文件
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		// 2、获取bean
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		// 3、执行方法
		System.out.println(helloWorld);
	}

}
