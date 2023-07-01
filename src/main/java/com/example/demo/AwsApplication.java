package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin("*")
public class AwsApplication {

	@GetMapping("/")
	public List<String> awsTest() {
		return Stream.of("Geeks", "for", "bedis","bouh").collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AwsApplication.class, args);
	}

}
