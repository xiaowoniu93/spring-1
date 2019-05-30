package com.xszheng.demo7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xszheng.domain.BeanLifeCycle;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext_second.xml");
		BeanLifeCycle beanLifeCycle = ctx.getBean("beanLifeCycle", BeanLifeCycle.class);
		System.out.println(beanLifeCycle.getName());

	}

}
