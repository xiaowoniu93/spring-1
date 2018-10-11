package com.xszheng.polymorphic.impl;

import org.springframework.stereotype.Service;

import com.xszheng.polymorphic.OutwayApi;

@Service(value="bailianOutwayApi")
public class BailianOutwayApi implements OutwayApi {

	@Override
	public String getPlatform() {
		return "bailian";
	}

}
