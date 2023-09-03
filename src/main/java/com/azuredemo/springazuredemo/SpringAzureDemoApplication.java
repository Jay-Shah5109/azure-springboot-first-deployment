package com.azuredemo.springazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {

	@GetMapping("/message/{name}")
	public String message(@PathVariable String name) {
		String msg = "This application has been hosted over Azure by: " + name + "appending new string here";
		return msg;
	}

	@GetMapping("/newmessage/{id}")
	public String newmessage(@PathVariable String id) {
		String msg = "This response is received via new endpoint deployed through Azure: " + id;
		return msg;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
	}

}
