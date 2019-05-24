package com.springCloud.servier.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 注册服务提供者
 */

/**
 *  @EnableDiscoveryClient 基于spring-cloud-commons
 *  @EnableEurekaClient    基于spring-cloud-netflix
    其实用更简单的话来说，就是如果选用的注册中心是eureka，那么就推荐@EnableEurekaClient，如果是其他的注册中心，那么推荐使用@EnableDiscoveryClient。
 */

@SpringBootApplication
@EnableEurekaClient //本服务启动后，会自动注册到eureka服务中
//@EnableDiscoveryClient //发现服务
public class ServiceProvierEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProvierEurekaApplication.class,args);
    }
}
