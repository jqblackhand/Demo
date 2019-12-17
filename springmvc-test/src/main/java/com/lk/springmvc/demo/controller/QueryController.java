package com.lk.springmvc.demo.controller;

import com.lk.springmvc.demo.pojo.User;
import com.lk.springmvc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kexl
 * @Title: spring-boot-demo
 * @Package com.lk.springmvc.demo.controller
 * @Description:
 * @date 2018/6/25 10:48
 */
@Controller
@RequestMapping("user")
public class QueryController {

	@Autowired
	private UserService userService;

	@RequestMapping("ulist")
	public String getListUser(Model model){
		List<Map<String,Object>> list =userService.findAll();
		model.addAttribute("list",list);
		return "user/ulist";
	}

	/**
	 * 新增页面
	 * @return
	 */
	@RequestMapping("addIndex")
	public String add(){
		return "user/add";
	}

	/**
	 * 新增
	 * @param user
	 * @return
	 */
	@RequestMapping("add")
	public String toAdd(User user){
		userService.insertUser(user);
		return "redirect:/user/ulist";
	}

	/**
	 * 更新页面
	 * @param id
	 * @return
	 */
	@RequestMapping("editIndex")
	public ModelAndView edit(int id){
		ModelAndView model=new ModelAndView("user/edit");
		Map<String,Object> map=new HashMap<>();
		map.put("id",id);
		List list=userService.findByMap(map);
		model.addObject("user",list.get(0));
		return model;
	}

	/**
	 * 更新
	 * @param user
	 * @return
	 */
	@RequestMapping("edit")
	public ModelAndView toEdit(User user){
		ModelAndView model=new ModelAndView("redirect:/user/ulist");
		userService.updateUser(user);
		return model;
	}

	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@RequestMapping("del")
	public ModelAndView del(int id){
		ModelAndView model=new ModelAndView("redirect:/user/ulist");
		userService.deleteUserById(id);
		return model;
	}


}
