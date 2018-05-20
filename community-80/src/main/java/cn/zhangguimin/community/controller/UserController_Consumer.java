package cn.zhangguimin.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import cn.zhangguimin.community.vo.UserVo;

@Controller
@RequestMapping(value = "/consumer")
public class UserController_Consumer extends BaseController {
	private static final String REST_URL_PREFIX = "http://COMMUNITY";
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(value = "/user/get/{id}")
	public String get(@PathVariable("id") Integer id) {
		restTemplate.getForObject(REST_URL_PREFIX + "/user/get/" + id, UserVo.class);
		return "index";
	}

}
