package com.kazela.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MeuPrimeiroProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroProjetoApplication.class, args);
		System.out.println("Meu primeiro Projeto...");
	}


	@Value("${paginacao.qtd_por_pagina}")
	private int qtdPorPagina;

	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.format("### Quantidade  de elementos por pagina = %d%n", this.qtdPorPagina);
		};
	}
}

