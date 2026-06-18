package com.itb.inf2gm.petlove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetloveApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetloveApplication.class, args);
		System.out.println("Server start port 8080");
	}

}
