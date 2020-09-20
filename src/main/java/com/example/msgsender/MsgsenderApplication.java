package com.example.msgsender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Configuration
@EnableEurekaClient
public class MsgsenderApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(MsgsenderApplication.class, args);
	}

}
