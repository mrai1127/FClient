package com.rai.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rai.feign.util.FeignServiceUtil;

@RestController
@RequestMapping("/demo")
public class FeignDemoController {

	@Autowired
	private FeignServiceUtil serviceUtil;
	
	@GetMapping("/username")
	public String getUserName() {
		return serviceUtil.getName();
	}
	
	@GetMapping("/useraddress")
	public String getUserAdd() {
		return serviceUtil.getAddress();
	}
	
	@GetMapping("/userstatus")
	public String getUserSts() {
		return serviceUtil.getStatus();
	}
}
