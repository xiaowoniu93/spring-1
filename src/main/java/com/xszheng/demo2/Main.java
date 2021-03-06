package com.xszheng.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Car car1 = (Car) ctx.getBean("car1");
		System.out.println("car1:"+car1);
		
		Car car2 = (Car) ctx.getBean("car2");
		System.out.println("car2:"+car2);
		
		Car car3 = (Car) ctx.getBean("car3");
		System.out.println("car3:"+car3);
		
		Car car4 = (Car) ctx.getBean("car4");
		System.out.println("car4:"+car4);
	}

}
