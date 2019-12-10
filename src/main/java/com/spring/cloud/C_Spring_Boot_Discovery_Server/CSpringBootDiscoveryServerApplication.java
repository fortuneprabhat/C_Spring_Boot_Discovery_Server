package com.spring.cloud.C_Spring_Boot_Discovery_Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CSpringBootDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CSpringBootDiscoveryServerApplication.class, args);
	}

}
