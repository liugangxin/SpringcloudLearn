一、zuul有以下功能：
Authentication
Insights
Stress Testing
Canary Testing
Dynamic Routing
Service Migration
Load Shedding
Security
Static Response handling
Active/Active traffic management
二、在application.yml配置中，首先指定服务注册中心的地址为http://localhost:8801/eureka/，服务的端口为8819，服务名为service-zuul；以/api-a/ 开头的请求都转发给service-ribbon服务；以/api-b/开头的请求都转发给service-feign服务；
三、运行流程
1、启动eureka-server
2、启动eureka-producer
3、启动service-ribbon
4、启动service-feign
5、启动本实例service-zuul
6、访问http://localhost:8819/api-a/test，以及http://localhost:8819/api-a/test?token=liu
6、访问http://localhost:8819/api-b/test