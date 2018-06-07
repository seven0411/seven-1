package com.myExample.controller;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myExample.pojo.JSONResult;
import com.myExample.pojo.Resources;
import com.myExample.pojo.User;

/**
 * 
 * @author song.qi
 * @version 2018年5月24日
 * @see springMVC
 */
// @Controller
@RestController // @RestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class MyController {

	@Autowired
	private Resources resources;

	@RequestMapping("/getResources")
	public JSONResult getResources() {

		Resources bean =new Resources();
		BeanUtils.copyProperties(resources, bean);
		return JSONResult.ok(bean);
	}
	
	@RequestMapping("/getUser")
	// @ResponseBody
	public User name() {
		User user = new User();
		user.setUserId("1");
		user.setUserName("张三");
		user.setDesc("备注1223");
		user.setBirthday(new Date());
		return user;
	}

	@RequestMapping("/getUserJson")
	public JSONResult getUserJson() {

		User user = new User();
		user.setUserId("12");
		user.setUserName("张三2");
		user.setDesc("备注22222");
		user.setBirthday(new Date());
		return JSONResult.ok(user);
	}


}
