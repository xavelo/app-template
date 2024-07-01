package com.xavelo.kafkaproducerk3s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:git.properties")
public class TemplateAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplateAppApplication.class, args);
	}

}
