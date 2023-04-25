#项目简介
>Dubbo 作为一款微服务框架，最重要的是向用户提供跨进程的 RPC 远程调用能力。如上图所示，Dubbo 的服务消费者（Consumer）通过一系列的工作将请求发送给服务提供者（Provider）。 
> 为了实现这样一个目标，Dubbo 引入了注册中心（Registry）组件，通过注册中心，服务消费者可以感知到服务提供者的连接方式，从而将请求发送给正确的服务提供者。

###本项目是作为dubbo的demon项目

#项目结构
1. dubbo-api
2. dubbo-consumer
3. dubbo-provider


#项目启动
1. 先启动 com.shaw.demo.provider.ProviderApp ，等待一会出现如下图所示的日志（Current Spring Boot Application is await）即代表服务提供者启动完毕，标志着该服务提供者可以对外提供服务了。
2. 然后是启动com.shaw.demo.consumer.ConsumerApp ，等待一会出现如下图所示的日志（Hello world ）即代表服务消费端启动完毕并调用到服务端成功获取结果。
