package com.taskman.mytasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
@EnableAutoConfiguration
public class MytasksApplication {
	public static void main(String[] args) {
		SpringApplication.run(MytasksApplication.class, args);
	}
}