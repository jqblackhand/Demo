package com.lk.springmvc.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author kexl
 * @Title: spring-boot-demo
 * @Package com.lk.springmvc.demo.controller
 * @Description:简单测试
 * @date 2018/6/21 16:35
 */
@Controller
public class indexController {

	private final static Logger log=LoggerFactory.getLogger(indexController.class);

	@RequestMapping("index")
	public String index(){
		return "index";
	}

	@RequestMapping("json")
	@ResponseBody
	public String json(){
		return "success:0";
	}

}
