package com.xszheng.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		
		System.out.println(helloWorld);
	}

}
