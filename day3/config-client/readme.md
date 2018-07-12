配置文件：
spring.application.name 要跟读取的文件名前缀一致
spring.cloud.config.label 指明远程仓库的分支
spring.cloud.config.profile
  dev开发环境配置文件
  test测试环境
  pro正式环境
spring.cloud.config.uri= http://localhost:8812/ 指明配置服务中心的网址。


1、运行报错问题：找不到属性“myname”，错误如下java.lang.IllegalArgumentException: Could not resolve placeholder 'myname' in value "${myname}"
解答：因为spring boot是启动的时候才从配置文件中读取配置属性，配置文件在远程配置中心的话，注册中心的信息需要放在bootstrap.properties中才能启动优先读取，放在application.properties.会报该异常没发现属性。
另外，妈卖批，假如你的配置中心的文件编码格式不是UTF-8无BOM的，也是会报同样的错。

2、依次运行eureka、config-server、本实例，然后访问http://localhost:8813/hello






spring:
  application:
    name: config-client
  cloud:
    config:
      label: master
      profile: dev
      discovery:
        enabled: true
        serviceId: CONFIG-SERVER
server:
  port: 8813
eureka:
  client:
    serviceUrl:
      defaultZone: http://localhost:8811/eureka/