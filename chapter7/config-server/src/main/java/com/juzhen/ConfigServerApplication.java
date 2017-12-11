package com.juzhen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableConfigServer//注解开启服务器配置功能
@SpringBootApplication
public class ConfigServerApplication {
	//http://localhost:8888/config-client/dev/  访问这个才能访问到配置文件的内容
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
