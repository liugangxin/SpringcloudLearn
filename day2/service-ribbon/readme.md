一、该子项目是服务消费者，并提供负债均衡功能：
作为消费者，消费服务测试方式：
1、首先，启动注册中心server，即eureka-server。
2、启动服务提供者eureka-producer，然后修改端口，再次启动，拥有两个服务实例。
3、启动本项目service-ribbon，通过restTemplate类指定具体url来消费指定的服务。这里是/hello的请求url，在浏览器访问即可，看到不同的服务实例起作用。

二、断路器测试：
先在pom.xml中加入spring-cloud-starter-hystrix，在启动类加注解配置，然后在消费服务接口上使用注解@HystrixCommand
1、启动注册中心eureka-server
2、启动该服务，访问http://localhost:8804/test

三、断路器监控页面：
首先要在pom.xml中加入spring-boot-starter-actuator和spring-cloud-starter-hystrix-dashboard，
1、启动该项目，访问http://localhost:8804/hystrix即可看到监控页面