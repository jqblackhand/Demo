package com.lk.springmvc.demo.service.impl;

import com.lk.springmvc.demo.dao.UserExtendMapper;
import com.lk.springmvc.demo.pojo.User;
import com.lk.springmvc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author kexl
 * @Title: spring-boot-demo
 * @Package com.lk.springmvc.demo.service.impl
 * @Description:业务类实现类
 * @注意：
 *      1.需要用@Service这个注解标识者是一个业务类；
 *      2.需要用@Autowired或者@Resource把mapper的接口对象注入到spring中；
 * @date 2018/6/25 11:04
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserExtendMapper userExtendMapper;

	@Override
	public List<Map<String, Object>> findAll() {
		return userExtendMapper.queryBySelect();
	}

	@Override
	public void insertUser(User user) {
		userExtendMapper.insert(user);
	}

	@Override
	public void deleteUserById(int userid) {
		userExtendMapper.delById(userid);
	}

	@Override
	public List<User> findByMap(Map<String, Object> map) {
		return userExtendMapper.query(map);
	}

	@Override
	public void updateUser(User user) {
		userExtendMapper.updateUser(user);
	}

	@Override
	public User getUserById(int userid) {
		return userExtendMapper.selectByPrimaryKey(userid);
	}

}
