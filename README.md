##3.1.1
服务注册中心

##3.1.2
服务提供者-8080
依赖6.1.2

##3.1.2.1
服务提供者-8079
依赖6.1.2

##3.1.3，3.1.4
服务注册中心集群-8081,8082

##3.1.5
服务消费者-9091
服务发现-Eureka客户端完成，服务消费-Ribbon

注意eureka的自我保护（开发环境下关闭）时间和服务提供者的服务调用时间（心跳）和服务失效(和eureka注册中心的红色警告相关)

添加Hystrix与Spring-boot

添加spring-cloud-hystrix-amqp

##服务续约，定义服务调用间隔和服务失效
![输入图片说明](https://github.com/TianYunZi/15springcloud/blob/master/picture/Eureka%E6%9C%8D%E5%8A%A1%E7%BB%AD%E7%BA%A6.png)

##5.1.1 
Hystrix服务容错保护，服务消费者-9092，
熔断机制默认2000后触发
Hystrix-dashboard添加
注意Zuul默认信号量隔离，应通过hystrix把隔离机制改成线程池

##5.1.2
服务消费者，提供web页面访问-9093

##5.1.3
提供公共缓存，使用redis-9094

##5.1.4
Turbine集群监控-9095, 9097

##5.1.5
Turbine-amqp(rabbitmq)-9098,9099

##6.1.1
Spring-Cloud-Feign-9100
依赖6.1.2

##6.1.2
继承特性

##7.1.1
Zuul网关-9096

##8.1.1
配置中心-9110（未完成）

##9.1.1
Spring-Boot-RabbitMq-9111

##10.1.1
Spring-Cloud-Stream-RabbitMq-9120

##11.1.1
Spring-Cloud-Sleuth-9130
微服务应用trace-1，调用trace-2

##11.1.2
Spring-Cloud-Sleuth-9131
微服务应用trace-2

