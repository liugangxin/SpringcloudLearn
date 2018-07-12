配置文件：
spring.cloud.config.server.git.uri：配置git仓库地址
spring.cloud.config.server.git.searchPaths：配置仓库路径
spring.cloud.config.label：配置仓库的分支
spring.cloud.config.server.git.username：访问git仓库的用户名
spring.cloud.config.server.git.password：访问git仓库的用户密码


1、运行后请访问http://192.168.0.101:8812/config-client/dev，会去寻找返回{"name":"config-client","profiles":["dev"],"label":null,"version":"6e17b2a67b5edbb0bea77d598ea4c0f0131a2b45","state":null,"propertySources":[{"name":"https://github.com/liugangxin/SpringcloudLearn/configFile/config-client-dev.properties","source":{"ï»¿myname":"liu"}}]}
此处看到没，myname前面有乱码，他NND，是文件的编码格式有问题。

2、http请求地址和资源文件映射如下:
请求路径：/{application}/{profile}[/{label}]
文件格式a：/{application}-{profile}.yml
文件格式b：/{label}/{application}-{profile}.yml
文件格式c：/{application}-{profile}.properties
文件格式d：/{label}/{application}-{profile}.properties


3、增加eureka配置后，先运行eureka，再运行本实例，访问http://localhost:8811/可以看到配置server服务