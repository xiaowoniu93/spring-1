package com.xszheng.demo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xszheng.domain.BoyFriend;
import com.xszheng.domain.GirlFriend;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext_second.xml");
//		Person person = (Person) ctx.getBean("person4");
//		System.out.println(person);
		
//		Person person1 = (Person) ctx.getBean("person5");
//		System.out.println(person1);
		
		BoyFriend boy = (BoyFriend) ctx.getBean("boyFriend");
		System.out.println(boy.getName());
		
		GirlFriend gril = (GirlFriend) ctx.getBean("girlFriend");
		System.out.println(gril.getName());
	}

}