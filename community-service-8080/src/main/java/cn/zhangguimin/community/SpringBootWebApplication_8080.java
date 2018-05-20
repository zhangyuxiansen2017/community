package cn.zhangguimin.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableCaching
@EnableEurekaClient
public class SpringBootWebApplication_8080 {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication_8080.class, args);
	}
}
