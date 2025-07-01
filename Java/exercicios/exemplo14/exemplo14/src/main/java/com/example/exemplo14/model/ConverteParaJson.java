package com.example.exemplo14.model;

import com.example.exemplo14.Tarefa;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ConverteParaJson {
    private ObjectMapper mapper = new ObjectMapper();

    public void obterDados(Tarefa tarefa){
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("tarefa.json"), tarefa);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
