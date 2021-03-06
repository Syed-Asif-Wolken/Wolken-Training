package com.wolken.wolkenTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.wolken.wolkenTask")
public class WolkenTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(WolkenTaskApplication.class, args);
	}
}
