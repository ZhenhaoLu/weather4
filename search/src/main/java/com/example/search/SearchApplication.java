package com.example.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class SearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SearchApplication.class, args);
    }

}

//public class SwaggerConfiguration {
//    public Docket api(){
//        return new Docket(DocumentationType.SWAGGER_2).select().
//                apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
//    }
//}