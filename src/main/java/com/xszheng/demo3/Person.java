package com.xszheng.demo3;

import com.xszheng.demo2.Car;

import lombok.Data;

@Data
public class Person {

	private String name;
	
	private Car car;

	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + "]";
	}
	
	public void info(){
		StringBuffer buffer = new StringBuffer();
		buffer.append(name).append(" has a car, the brand is ").append(car.getBrand());
		System.out.println(buffer);
	}
}
