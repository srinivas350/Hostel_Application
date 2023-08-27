package com.room.Room_Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.room.repository")
@EntityScan(basePackages="com.room.entity")
@ComponentScan(basePackages="com.room")
public class HostelApplication {

	public static void main(String[] args) {
		SpringApplication.run(HostelApplication.class, args);
	}

}
