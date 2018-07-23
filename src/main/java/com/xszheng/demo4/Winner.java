package com.xszheng.demo4;

import java.util.List;
import java.util.Map;

import com.xszheng.demo2.Car;

import lombok.Data;

@Data
public class Winner {
	
	private String name;
	
	private List<String> bankCards;
	
	private List<Car> cars;
	
	private Map<String, String> map;

	@Override
	public String toString() {
		return "Winner [name=" + name + ", bankCards=" + bankCards + ", cars=" + cars + ", map=" + map + "]";
	}

}
