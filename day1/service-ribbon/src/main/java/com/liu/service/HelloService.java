package com.liu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
	@Autowired
	RestTemplate restTemplate;

	/**
	 * 其中即服务提供者provider项目的application大写名(service-helloLiu)
	 * 
	 * @param name
	 * @return
	 */
	public String helloService() {
		return restTemplate.getForObject("http://SERVICE-HELLOLIU/hello?name=liu", String.class);
	}

}
