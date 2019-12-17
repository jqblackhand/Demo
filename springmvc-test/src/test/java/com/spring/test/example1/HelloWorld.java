package com.spring.test.example1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 获取HelloWorld字符串
 *
 * @author Gabriel
 */
public class HelloWorld {
	
	protected static final Log log = LogFactory.getLog(HelloWorld.class);
//	protected final Log log = LogFactory.getLog(this.getClass());
	
	public String getContent() {
		FileHelloStr fhStr = new FileHelloStr("helloworld.properties");
		String helloworld = fhStr.getContent();
		
		return helloworld;
	}

}
