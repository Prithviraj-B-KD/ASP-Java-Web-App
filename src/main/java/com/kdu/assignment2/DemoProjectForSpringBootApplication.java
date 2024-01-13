package com.kdu.assignment2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoProjectForSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectForSpringBootApplication.class, args);
	}
	@RestController
	class HelloController {
		@GetMapping("/")
		public String index() {
			return "Github - Hello Prithvi ,KD-24";
		}
	}
}
