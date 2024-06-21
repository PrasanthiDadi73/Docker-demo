package com.springboot.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {


   @GetMapping("/message")
	public String getMessage(){
		return "Hi welcome ";
	}

	@GetMapping("/hello")
	public String getHello(){ return "hello"; }


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
