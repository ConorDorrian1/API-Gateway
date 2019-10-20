package com.master.Zuul;

import com.master.Zuul.Configuration.Filter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

// Application gateway (Zuul)

@SpringBootApplication
// Reverse proxy is used so that it can forward the requests to other services in the microservices
@EnableZuulProxy  //Reverse proxy
@EnableEurekaClient
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

    @Bean
    public Filter filter() {
        return new Filter();
    }

}
