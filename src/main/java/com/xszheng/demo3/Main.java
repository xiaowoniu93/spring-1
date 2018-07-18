package com.xszheng.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
		person.info();
		
		Person person1 = (Person) ctx.getBean("person1");
		System.out.println("person1:"+person1);
		
		Person person2 = (Person) ctx.getBean("person2");
		System.out.println("person2:"+person2);
		
		Person person3 = (Person) ctx.getBean("person3");
		System.out.println("person3:"+person3);
	}

}
