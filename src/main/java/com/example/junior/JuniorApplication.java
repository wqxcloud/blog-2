package com.example.junior;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableTransactionManagement
@EnableCaching
@EnableScheduling
@MapperScan(basePackages = "com.example.junior.Dao")
public class JuniorApplication {

	/**
	 * 在配置文件中配置的文件保存路径
	 */
	//@Value("${image}")
	//private String location;

	public static void main(String[] args) {
		SpringApplication.run(JuniorApplication.class, args);
	}
}
