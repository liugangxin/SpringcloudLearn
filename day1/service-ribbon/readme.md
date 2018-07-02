该子项目是服务消费者，并提供负债均衡功能：
1、首先，启动注册中心server，即eureka-server。
2、启动服务提供者eureka-producer，然后修改端口，再次启动，拥有两个服务实例。
3、启动本项目service-ribbon，通过restTemplate类指定具体url来消费指定的服务。这里是/hello的请求url，在浏览器访问即可，看到不同的服务实例起作用。
