package com.example.prep_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PrepDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrepDemoApplication.class, args);
	}

	@GetMapping("/hello")
	// Vi tar emot en parameter (sträng) för namn i URL:en, med standardvärde
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name){

		return String.format("Hello %s!", name);// Om namn skickats med, skriv ut det
	}

	@GetMapping("/numb")
	// Vi tar emot en parameter (sträng) för namn i URL:en, med standardvärde
	public Integer numb(){
		return 123;
	}
}
