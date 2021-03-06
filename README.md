# java web

结合CSS、HTML、JS、Tomcat实现Web页面

# Spring5

Spring是轻量级的开源javaEE框架

Spring解决企业应用开发的复杂性

Spring有两个核心部分：IOC和AOP

- IOC：控制反转，把创建对象过程交给spring进行管理，https://www.zhihu.com/search?q=%E5%A6%82%E4%BD%95%E5%AD%A6%E4%B9%A0springboot&utm_content=search_suggestion&type=content
- AOP：面向切面：不修改源代码进行功能增强

Spring特点

- 方便接耦、简化开发
- AOP编程支持
- 方便程序测试
- 方便和其他框架进行整合
- 方便进行事务操作
- 降低API开发难度

# SpringMVC

> 经典MVC模式中，M是指业务模型，V是指用户界面，C则是控制器，使用MVC的目的是
> 将M和V的实现代码分离，从而使同一个程序可以使用不同的表现形式。其中，View的
> 定义比较清晰，就是用户界面。

springmvc是一种web层mvc框架，它是spring的一个模块，拥有spring的特性。
springmvc分离了控制器、模型对象、分派器以及处理程序对象的角色。

# MyBatis

MyBatis是一款优秀的持久层框架，它支持定制化SQL、存储过程以及高级映射。
MyBatis避免了几乎所有的JDBC代码和手动设置参数以及获取结果集。MyBatis
可以使用简单的XML或注解来配置和映射原生信息，将接口和Java的POJOs映射成
数据库中的记录。

# Maven

包管理工具

# SSM

SSM框架，是Spring + Spring MVC + MyBatis的缩写

# Redis

Redis是完全开源的，遵守BSD协议的，高性能的key-value数据库。

Redis与其他key-value缓存产品有以下三个特点：

- Redis支持数据的持久化，可以将内存中的数据保存在磁盘中，重启的时候可以再
  次加载进行使用。
- Redis不仅仅支持简单的key-value类型的数据，同时还提供list，set，zset，
  hash等数据结构的存储。
- Redis支持数据的备份，即master-slave模式的数据备份。

# Dubbo

Apache Dubbo是一款高性能、轻量级的开源Java RPC框架，它提供了三大核心能力：
面向接口的远程方法调用，智能容错和负载均衡，以及服务自动注册和发现

# SpringBoot

Spring Boot是一个基于Spring的套件，它帮我们预组装了Spring的一系列组件，
以便以尽可能少的代码和配置来开发基于Spring的Java应用程序。

以汽车为例，如果我们想组装一辆汽车，我们需要发动机、传动、轮胎、底盘、外壳、
座椅、内饰等各种部件，然后把它们装配起来。Spring就相当于提供了一系列这样的
部件，但是要装好汽车上路，还需要我们自己动手。而Spring Boot则相当于已经帮
我们预装好了一辆可以上路的汽车，如果有特殊的要求，例如把发动机从普通款换成
涡轮增压款，可以通过修改配置或编写少量代码完成。

因此，Spring Boot和Spring的关系就是整车和零部件的关系，它们不是取代关系，
试图跳过Spring直接学习Spring Boot是不可能的。

Spring Boot的目标就是提供一个开箱即用的应用程序架构，我们基于Spring Boot
的预置结构继续开发，省时省力。

# SpringCloud

Spring Cloud是一系列框架的有序集合。它利用Spring Boot的开发便利性巧妙地
简化了分布式系统基础设施的开发，如服务发现注册、配置中心、消息总线、负载均衡、
断路器、数据监控等，都可以用Spring Boot的开发风格做到一键启动和部署。

Spring Could并没有重复制造轮子，它只是将目前各家公司开发的比较成熟、经得起
实际考验的服务框架组合起来，通过Spring Boot风格进行再封装屏蔽掉了复杂的配置
和实现原理，最终给开发者留出了一套简单易懂、易部署和易维护的分布式系统开发工
具包。

微服务是可以独立部署、水平扩展、独立访问（或者有独立的数据库）的服务单元，
Spring Cloud就是这些微服务的大管家，采用了微服务这种架构之后，项目的数量会
非常多，Spring Cloud需要管理好这些微服务。

# Spring boot特点

## 依赖管理

- 开发导入starter场景启动器

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>
```

会见到很多类似spring-boot-starter-*的场景启动器，*代表某种场景只要引入starter，
这个场景所有常规需要的依赖我们都自动引入

在官网查看所有场景：https://docs.spring.io/spring-boot/docs/current/reference/html/using.html#using.build-systems.starters

*-spring-boot-starter是第三方开发的启动器

所有场景启动器最底层的依赖是

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter</artifactId>
    <version>2.3.4.RELEASE</version>
    <scope>compile</scope>
</dependency>
```

- 无需关注版本号，自动版本仲裁

```xml
<!--依赖管理-->
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.3.4.RELEASE</version>
</parent>

<!--父项目，几乎声明了所有常用依赖的版本，但是没有mybatis-->
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-dependencies</artifactId>
    <version>2.3.4.RELEASE</version>
</parent>

<!--可以修改版本号-->
<properties>
    <mysql.version>5.1.43</mysql.version>
</properties>
```

- 可以修改版本号

## 自动配置

MainApplication所在的包及其子包自动配置了包扫描，也可以手动配置@SpringBootApplication(scanBasePackages = "com.zt")

@SpringBootApplication(scanBasePackages = "com.zt")

等同于

@SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan

@EnableAutoConfiguration：启用 SpringBoot 的自动配置机制

@ComponentScan： 扫描被@Component、@Service、@Controller、@Repository注解的bean，注解默认会扫描该类所在的包下所有的类

# 单元测试

需要引入依赖

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
</dependency>
```

Spring Boot 2.2.0版本开始引入JUnit5作为单元测试默认库

JUnit5 = JUnit Platform + JUnit Jupiter + JUnit Vintage

JUnit Jupiter：核心，包含测试引擎，运行在JUnit Platform

JUnit Vintage：兼容JUnit3和JUnit4

```java
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class springBootTest {

  @Autowired

  @Test
  void test() {

  }
}

```

常用注解：https://junit.org/junit5/docs/current/user-guide/#writing-tests-annotations

比较好用的是参数化测试