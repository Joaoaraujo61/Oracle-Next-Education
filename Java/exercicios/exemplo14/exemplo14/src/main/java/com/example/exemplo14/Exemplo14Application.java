package com.example.exemplo14;

import com.example.exemplo14.model.ConverteParaJson;
import com.example.exemplo14.model.ConverteParaTarefa;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class Exemplo14Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Exemplo14Application.class, args);
	}

	@Override
	public void run(String... arg) throws Exception{
		Tarefa tarefa = new Tarefa("Lavar louça", false, "João");
		ConverteParaJson conversor = new ConverteParaJson();
		ConverteParaTarefa conversorTarefa = new ConverteParaTarefa();

		conversor.obterDados(tarefa);
		Tarefa tarefa1 = conversorTarefa.capturaDadosJson(new File("tarefa.json"));
		System.out.println(tarefa1);
	}
}
