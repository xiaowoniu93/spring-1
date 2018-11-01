package com.xszheng.demo6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		EnvUtil envUtil = (EnvUtil) ctx.getBean("envUtil");
		System.out.println(envUtil.getEnv());
	}

}
