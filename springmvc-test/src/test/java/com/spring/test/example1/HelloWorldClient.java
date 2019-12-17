package com.spring.test.example1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class HelloWorldClient {

	protected static final Log log = LogFactory.getLog(HelloWorldClient.class);
	
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();
		log.info(hw.getContent());
	}
}
