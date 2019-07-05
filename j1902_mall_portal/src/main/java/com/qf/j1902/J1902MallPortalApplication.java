package com.qf.j1902;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients//开启负载均衡
@EnableHystrix//开启熔断
@SpringBootApplication
public class J1902MallPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(J1902MallPortalApplication.class, args);
	}

}
