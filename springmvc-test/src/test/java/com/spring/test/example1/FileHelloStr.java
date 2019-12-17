package com.spring.test.example1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class FileHelloStr {
	
	protected static final Log log = LogFactory.getLog(FileHelloStr.class);
	private String propFilename;
	
	public FileHelloStr(String propFilename) {
		super();
		this.propFilename = propFilename;
	}
	
	public String getContent() {
		String helloworld = "";
		InputStream is = null;
		
		try {
			Properties properties = new Properties();
			is = this.getClass().getClassLoader().getResourceAsStream(propFilename);
			properties.load(is);
//			is.close();
			helloworld = properties.getProperty("helloworld2");
			
		} catch (FileNotFoundException e) {
			log.error(e);
		} catch (IOException e) {
			log.error(e);
		} catch (Exception e) {
			log.error(e);
		} finally {
			log.debug("进入finally块");
			if (is != null) {
				log.debug("进入finally if 块");
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
