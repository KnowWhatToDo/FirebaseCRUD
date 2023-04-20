package com.MyApplication.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import ComponentScan
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@RestController
// @ComponentScan(basePackages = "com.MyApplication.demo.controllers")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name,
						@RequestParam(value = "email", defaultValue = "World") String email) {
        return String.format("Hello %s!\nEmail %s", name,email);
    }
}
