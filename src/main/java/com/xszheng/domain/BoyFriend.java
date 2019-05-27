package com.xszheng.domain;

public class BoyFriend {
	
	private String name;
	
	private GirlFriend girlFriend;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GirlFriend getGirlFriend() {
		return girlFriend;
	}

	public void setGirlFriend(GirlFriend girlFriend) {
		this.girlFriend = girlFriend;
	}

	public BoyFriend(String name, GirlFriend girlFriend) {
		super();
		this.name = name;
		this.girlFriend = girlFriend;
	}

	public BoyFriend() {
		super();
	}
	
}
