package cn.zhangguimin.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.zhangguimin.community.service.UserService;
import cn.zhangguimin.community.vo.UserVo;

@Controller
public class UserController extends BaseController {

	@Autowired
	private UserService service;

	@GetMapping(value = "/user/get/{id}")
	@ResponseBody
	public UserVo get(@PathVariable("id") Integer id) {
		UserVo vo = service.get(id);
		return vo;
	}
}
