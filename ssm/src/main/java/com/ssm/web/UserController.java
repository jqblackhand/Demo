package com.ssm.web;

import com.ssm.entity.User;
import com.ssm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class UserController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * 使用@Autowired也可以，@Autowired默认按类型装配
     * @Resource 默认按名称装配，当找不到与名称匹配的bean才会按类型装配。
     */
    @Autowired
    private UserService userService;
    /**
     * 测试查询
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/showUser")
    public String testtoshowUser(@RequestParam(value = "id") Integer id, Model model) {
        log.debug("id: {}", id);
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "showUser";
    }

    /**
     * 测试添加数据
     *
     * @return
     */
    @RequestMapping("/insertUser")
    public String testInsertUser() {
        User user = new User();
        user.setUsername("李清照");
        user.setPassword("3232322");
        user.setAge(22);
        int count = userService.insertUser(user);
        log.debug("插入 {} 条数据成功", count);
        return "showUser";
    }
}
