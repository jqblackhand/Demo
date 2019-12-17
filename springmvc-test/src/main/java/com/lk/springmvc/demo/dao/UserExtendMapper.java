package com.lk.springmvc.demo.dao;

import com.lk.springmvc.demo.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author kexl
 * @Title: spring-boot-demo
 * @Package com.lk.springmvc.demo.dao
 * @Description:通过mybatis提供的各种标签实现动态拼接sql语句
 * @date 2018/6/25 11:16
 */
@Repository
public interface UserExtendMapper extends UserMapper{

	/**
	 * 添加
	 * @param user
	 */
	void insert(User user);
	/**
	 *多条件查询
	 * @param map
	 * @return
	 */
	List<User> query(Map<String,Object> map);

	/**
	 * 更新
	 * @param user
	 */
	void updateUser(User user);

	/**
	 * 删除
	 * @param id
	 */
	void delById(int id);
	
	/**
	 * 查询
	 * @param id
	 */
	User selectByPrimaryKey(int id);
}
