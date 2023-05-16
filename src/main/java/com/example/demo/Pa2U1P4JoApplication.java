package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P4JoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer proyecto");
		Profesor profe = new Profesor();
		profe.setNombre("Jimmy");
		profe.setCedula("0105966337");
		profe.setFechaNacimiento(LocalDateTime.now());
		profe.setApellido("Ortega");
		
		System.out.println(profe);
		
	}

}
