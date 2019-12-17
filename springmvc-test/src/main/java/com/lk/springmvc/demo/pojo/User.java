package com.lk.springmvc.demo.pojo;

/**
 * @author kexl
 * @Title: spring-boot-demo
 * @Package com.lk.springmvc.demo.pojo
 * @Description:user 实体类  可使用mybatis-generator自动生成，我这里只是一个简单的user表举例，就自己手写了
 * @date 2018/6/21 14:48
 */
public class User {
	private int id;
	private String username;
	private String password;
	private String sex;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
