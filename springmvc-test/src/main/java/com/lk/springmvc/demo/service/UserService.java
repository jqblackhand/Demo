package com.lk.springmvc.demo.service;

import com.lk.springmvc.demo.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author kexl
 * @Title: spring-boot-demo
 * @Package com.lk.springmvc.demo.service
 * @Description:业务类接口
 * @date 2018/6/25 11:03
 */
public interface UserService {

	List<Map<String,Object>> findAll();
	void insertUser(User user);
	void deleteUserById(int userid);
	List<User> findByMap(Map<String,Object> map);
	void updateUser(User user);
	User getUserById(int userid);
}
