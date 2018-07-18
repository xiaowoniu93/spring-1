package com.xszheng.polymorphic.impl;

import org.springframework.stereotype.Service;

import com.xszheng.polymorphic.OutwayApi;

@Service(value="eBaiOutwayApi")
public class EBaiOutwayApi implements OutwayApi {

	@Override
	public String getPlatform() {
		return "EBai";
	}

}
