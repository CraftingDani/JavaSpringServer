package de.crafingdani.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MainBackend
{

	public static void main(String[] args)
	{
		SpringApplication.run(MainBackend.class, args);
		System.out.println("\nserver start finished on localhost:8080/api!\n");
	}

	@GetMapping("/*")
	public String test()
	{
		System.out.println("someone entered.");
		return "hi";
	}
}