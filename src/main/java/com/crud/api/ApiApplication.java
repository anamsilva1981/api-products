package com.crud.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

//	- Criar um repository - 1
//	- Service (chama o repository) - 2
//	- Criar um DTO (Recebe os produtos)
//	- Controller (Chama o Service e Passa o DTO) é
//	porta de entrada da aplicacao

}


