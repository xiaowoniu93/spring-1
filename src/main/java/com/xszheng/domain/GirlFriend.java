package com.xszheng.domain;

public class GirlFriend {
	
	private String name;
	
	private BoyFriend boyFriend;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BoyFriend getBoyFriend() {
		return boyFriend;
	}

	public void setBoyFriend(BoyFriend boyFriend) {
		this.boyFriend = boyFriend;
	}

	public GirlFriend(String name, BoyFriend boyFriend) {
		super();
		this.name = name;
		this.boyFriend = boyFriend;
	}

	public GirlFriend() {
		super();
	}
	
}
