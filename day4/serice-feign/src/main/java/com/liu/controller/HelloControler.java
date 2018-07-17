package com.liu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liu.service.FeignHelloService;
import com.liu.service.FeignHystrixHelloService;

@RestController
public class HelloControler {

	@Autowired
	FeignHelloService helloService;
	
	@Autowired
	FeignHystrixHelloService hystrixHelloService;

	/**
	 * 传参数可以@RequestParam String param
	 * 
	 * @return
	 */
	@RequestMapping(value = "/test")
	public String helloService() {
		return "feign:" + helloService.sayHello("liu");
	}
	
	@RequestMapping(value = "/hystrixTest")
	public String hystrixHelloService() {
		return hystrixHelloService.sayHello("xin");
	}

}