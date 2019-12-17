package com.ssm.service;

import com.ssm.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    public List findAll();

    public int insertUser(User user);

    public List findByMap(Map map);

    public void updateUser(User user);

    public void deleteUserById(int id);

    //根据id查找
    public User getUserById(Integer userid);
}
