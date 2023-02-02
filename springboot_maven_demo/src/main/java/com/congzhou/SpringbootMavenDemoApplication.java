package com.congzhou;

import com.congzhou.component.filter.ExceptionFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootMavenDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMavenDemoApplication.class, args);
    }

    /**
     * Filter
     */
    @Bean
    public FilterRegistrationBean<ExceptionFilter> filterRegistrationBean() {
        FilterRegistrationBean<ExceptionFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new ExceptionFilter());
        registration.addUrlPatterns("/*");
        return registration;
    }

}
