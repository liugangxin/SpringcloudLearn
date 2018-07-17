package com.liu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.liu.service.HelloService;

@RestController
public class HelloControler {

	@Autowired
	HelloService helloService;

	/**
	 * 传参数可以@RequestParam String param
	 * 
	 * @return
	 */
	@RequestMapping(value = "/test")
	public String helloService() {
		return "ribbon:" + helloService.helloService();
	}

}