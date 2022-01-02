package de.crafingdani.backend.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainBackend
{
	public static void main(String[] args)
	{
		SpringApplication.run(MainBackend.class, args);
		System.out.println("\nServer started! address: localhost, port: 8080\n");
	}
}