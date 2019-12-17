package com.spring.test.example4;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sun.xml.internal.bind.v2.util.XmlFactory;

public class HelloWorldClient {

	protected static final Log log = LogFactory.getLog(HelloWorldClient.class);
	
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("appcontext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		HelloWorld hw = (HelloWorld) factory.getBean("fileHelloWorld");
		log.info(hw.getContent());
	}
}
