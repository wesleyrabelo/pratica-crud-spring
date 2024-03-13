package com.wesleyRabelo.demo;

import com.wesleyRabelo.demo.entity.Cliente;
import com.wesleyRabelo.demo.repository.ClienteRepository;
import com.wesleyRabelo.demo.service.ClienteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraticaCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(PraticaCrudApplication.class, args);
	}
}
