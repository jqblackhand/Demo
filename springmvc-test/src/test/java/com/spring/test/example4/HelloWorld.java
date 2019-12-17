package com.spring.test.example4;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class HelloWorld {
	
	protected static final Log log = LogFactory.getLog(HelloWorld.class);
	private HelloStr hStr;
	
	public HelloWorld(HelloStr hStr) {
		super();
		this.hStr = hStr;
	}

	public String getContent() {
		return hStr.getContent();
	}
}
