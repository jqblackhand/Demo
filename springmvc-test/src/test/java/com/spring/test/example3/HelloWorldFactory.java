package com.spring.test.example3;

/**
 * 注入HelloStr和HelloWorld依赖性
 *
 * @author Gabriel
 */
public class HelloWorldFactory {
	
	public static HelloWorld getFileHelloWorld() {
		HelloStr hStr = new FileHelloStr("helloworld.properties");
		HelloWorld hw = new HelloWorld(hStr);
		
		return hw;
	}

}
