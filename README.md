# learndubbo
dubbo进化学习

dubbo学习演化，最终目的是使用nacos作为注册中心，nacos高可用。dubbo使用rest作为传输协议。编写java客户端jar包和python包

springboot + dubbo
## zk-dubbo
1. zk 代表用zookeeper作为注册中心
2. dubbo 代表 dubbo协议
### 开发步骤
1. 启动zk
2. 使用dubbo-spring-boot-starter
3. 共用接口模块（耦合性高，看个人项目）
4. 提供着，在代码中模拟数据
5. 消费者，消费。
## 代码
代码很简单，pom引入依赖，配置依赖，是否需要配置，编写方法

dubbo关注的是配置，而不是简简单单的跑通hello world
## 负载均衡
1. zk可以高可用
2. dubbo 提供着高可用，运行不通的配置文件即可
3. 负载均衡：
    3.1 Random LoadBalance 权重随机
    3.2 RoundRobin LoadBalance 轮询
    3.3 LeastActive LoadBalance
    3.4 ConsistentHash LoadBalance

## dubbo-admin
参考官网文档，现在admin也是前后端分离

## nacos-rest
注册中心使用nacos，传输协议使用rest
1. nacos 官网
2. rest接口标准
### nacos
使用nacos入门很简单，但是有很多配置，需要跟着官网一步一步学习。
1. 目前只用了nacos的注册中心的功能
### rest


