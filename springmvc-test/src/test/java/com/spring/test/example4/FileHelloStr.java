package com.spring.test.example4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class FileHelloStr implements HelloStr {
	
	protected static final Log log = LogFactory.getLog(FileHelloStr.class);
	private String propFilename;
	
	public FileHelloStr(String propFilename) {
		super();
		this.propFilename = propFilename;
	}
	
	@Override
	public String getContent() {
		String helloworld = "";
		InputStream is = null;
		
		try {
			Properties properties = new Properties();
			is = this.getClass().getClassLoader().getResourceAsStream(propFilename);
			properties.load(is);
			helloworld = properties.getProperty("helloworld");
			
		} catch (FileNotFoundException e) {
			log.error(e);
		} catch (IOException e) {
			log.error(e);
		} catch (Exception e) {
			log.error(e);
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					log.error("执行finally回收资源失败", e);
				}
			}
		}
		
		return helloworld;
	}

}
