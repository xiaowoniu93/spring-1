package com.xszheng.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xszheng.domain.Address;

public class Main {

	public static void main(String[] args) {
		// bean 之间的继承
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext_second.xml");
		Address address = (Address) ctx.getBean("address1");
		System.out.println(address);
	}

}
