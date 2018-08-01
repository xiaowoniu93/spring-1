package com.xszheng.demo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xszheng.domain.Person;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext_second.xml");
		Person person = (Person) ctx.getBean("person4");
		System.out.println(person);
	}

}