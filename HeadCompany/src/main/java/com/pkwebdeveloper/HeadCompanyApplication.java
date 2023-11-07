package com.pkwebdeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableEurekaServer
@EnableFeignClients
@SpringBootApplication
public class HeadCompanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeadCompanyApplication.class, args);
		System.err.println("HeadCompany Executed...................");
	}
	
	
	@Bean
	public RestTemplate getObject() {
		
		   return new RestTemplate();
	}

}
