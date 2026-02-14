package com.paf.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // This annotation indicates that this is a Spring Boot application. It enables auto-configuration and component scanning.

@RestController // This annotation indicates that this class will handle HTTP requests and return responses directly from the methods, without needing to use a separate view or template.
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }

    @GetMapping("/hello1")
    public String helloWithName(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

}

