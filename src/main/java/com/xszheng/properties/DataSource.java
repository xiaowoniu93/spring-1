package com.xszheng.properties;

import java.util.Properties;

public class DataSource {

	private Properties props;

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	@Override
	public String toString() {
		return "DataSource [props=" + props + "]";
	}
	
}
