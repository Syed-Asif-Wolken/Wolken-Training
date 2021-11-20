package com.wolken.wolkenReTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.wolken.wolkenReTask")
public class WolkenReTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(WolkenReTaskApplication.class, args);
	}

}
