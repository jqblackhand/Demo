package com.spring.test.example2;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class HelloWorldClient {

	protected static final Log log = LogFactory.getLog(HelloWorldClient.class);
	
	public static void main(String[] args) {
		FileHelloStr fhStr = new FileHelloStr("helloworld.properties");
		HelloWorld hw = new HelloWorld(fhStr);
		log.info(hw.getContent());
	}
}
