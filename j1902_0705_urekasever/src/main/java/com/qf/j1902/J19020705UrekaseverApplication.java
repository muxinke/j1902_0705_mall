package com.qf.j1902;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer//开启注册服务
@SpringBootApplication
public class J19020705UrekaseverApplication {

	public static void main(String[] args) {
		SpringApplication.run(J19020705UrekaseverApplication.class, args);
	}

}
