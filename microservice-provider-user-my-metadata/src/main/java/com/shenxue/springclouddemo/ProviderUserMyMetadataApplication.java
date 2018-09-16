package com.shenxue.springclouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderUserMyMetadataApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderUserMyMetadataApplication.class, args);
	}
}
