package com.idream;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IdreamItSolutionApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdreamItSolutionApplication.class, args);
	}

  @GetMapping("/")
  public String welcome() {
    return "<h1>Welcome!!!</h1>";
  }
}