package com.liu.service.impl;

import org.springframework.stereotype.Component;

import com.liu.service.FeignHystrixHelloService;

@Component
public class FeignHystrixHelloServiceImpl implements FeignHystrixHelloService {

	@Override
	public String sayHello(String name) {
		return "error, " + name;
	}

}
