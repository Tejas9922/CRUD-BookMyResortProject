package com.tka.crudproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com.tka.entity")
public class CrudProjectBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudProjectBookingApplication.class, args);
		System.out.println("App Started");
	}

}
