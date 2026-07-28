package com.br.alura;

import com.br.alura.model.Tarefa;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.Scanner;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContadorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		Tarefa tarefaLida = objectMapper.readValue(new File("tarefa.json"), Tarefa.class);
		System.out.println("Tarefa lida do JSON:");
		System.out.println(tarefaLida);
	}

	/*@Override
	public void run(String... args) throws Exception {
		System.out.println("Bem-vindo ao Contador");
		System.out.println("========================");
		System.out.println("Digite um numero:");
		Scanner scanner = new Scanner(System.in);

		var numero = scanner.nextInt();
		for(int i = 1; i <= numero; i++){
			System.out.print(i + " ");
		}

	}*/
}
