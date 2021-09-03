package com.zt.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan
 * @EnableAutoConfiguration：启用 SpringBoot 的自动配置机制
 * @ComponentScan： 扫描被@Component、@Service、@Controller、@Repository注解的bean，注解默认会扫描该类所在的包下所有的类
 * @Configuration：允许在 Spring 上下文中注册额外的 bean 或导入其他配置类
 */
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
