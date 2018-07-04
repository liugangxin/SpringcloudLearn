package com.liu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

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
	@HystrixCommand(fallbackMethod = "helloError")
	public String helloService() {
		return restTemplate.getForObject("http://SERVICE-HELLOLIU/hello?name=liu", String.class);
	}

	public String helloError() {
        return "error,liu!";
    }
}
