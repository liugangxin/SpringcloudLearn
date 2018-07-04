package com.liu.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.liu.service.impl.FeignHystrixHelloServiceImpl;

/**
 * 带熔断器功能的消费服务。
 * service-helloLiu是provider提供的服务名
 *
 */
@FeignClient(value = "service-helloLiu",fallback = FeignHystrixHelloServiceImpl.class)
public interface FeignHystrixHelloService {
	
	/**
	 * 该映射要和provider值保持一致,不然会报错404，如下：
	 * feign.FeignException: status 404 reading FeignHelloService#sayHello(String)
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	String sayHello(@RequestParam(value = "name") String name);
}
