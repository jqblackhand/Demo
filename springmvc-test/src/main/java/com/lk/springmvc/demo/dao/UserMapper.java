package com.lk.springmvc.demo.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author kexl
 * @Title: spring-boot-demo
 * @Package com.lk.springmvc.demo.dao
 * @Description:使用mybatis注解实现动态sql语句
 * @date 2018/6/25 10:54
 */

public interface UserMapper {

	/**
	 * 可使用mybatis注解sql
	 * 用@Select注解sql语句
	 * @return
	 */
	@Select("select * from user ")
	List<Map<String,Object>> queryBySelect();

}
