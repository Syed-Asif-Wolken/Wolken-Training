package org.lucky.nay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.lucky.nay")
public class NayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NayApplication.class, args);
	}

}
