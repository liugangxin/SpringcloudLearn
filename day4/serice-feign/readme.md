一、该子项目是服务消费者，使用了Feign，它使得 Java HTTP 客户端编写更方便，Feign 灵感来源于Retrofit、JAXRS-2.0和WebSocket。Feign 最初是为了降低统一绑定Denominator 到 HTTP API 的复杂度，不区分是否支持 Restful：
Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。
特性：
1、Feign 采用的是基于接口的注解
2、Feign 整合集成了ribbon
3、Feign自带断路器，没有默认打开，需要在配置中加feign.hystrix.enabled=true

二、作为消费者，消费服务测试方式：
1、启动eureka-server
2、启动两个service-provider实例
3、启动本实例，访问

三、断路器测试方式：
1、启动eureka-server
2、启动本服务serice-feign（记得事先开启断路器配置），访问提供了短路注解配置的服务。

四、断路器监控，和ribbon方式一样。