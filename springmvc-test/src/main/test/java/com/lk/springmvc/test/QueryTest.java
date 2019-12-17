package com.lk.springmvc.test;

import com.lk.springmvc.demo.pojo.User;
import com.lk.springmvc.demo.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author kexl
 * @Title: spring-boot-demo
 * @Package java.com.lk.springmvc.test
 * @Description:
 * @date 2018/6/21 15:52
 */
public class QueryTest extends BaseTestSpring{
	@Autowired
	private UserService userService;

	@Test
	public void insert(){
		User user=new User();
		user.setUsername("sptest");
		user.setPassword("123456");
		user.setSex(1);
		userService.insertUser(user);
	}
}
