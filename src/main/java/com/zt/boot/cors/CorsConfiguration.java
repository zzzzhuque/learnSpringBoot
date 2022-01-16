package com.zt.boot.cors;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CorsConfiguration {
    @Bean
    public FilterRegistrationBean corsFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new CorsFilter());
        registration.setOrder(Integer.MIN_VALUE);
        registration.setName("corsFilter");
        return registration;
    }

}
