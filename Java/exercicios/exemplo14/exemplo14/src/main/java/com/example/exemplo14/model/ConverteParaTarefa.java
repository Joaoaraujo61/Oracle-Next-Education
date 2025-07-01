package com.example.exemplo14.model;

import com.example.exemplo14.Tarefa;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ConverteParaTarefa {
    private ObjectMapper mapper = new ObjectMapper();
    public Tarefa capturaDadosJson(File arquivo){

        try {
            return mapper.readValue(arquivo, Tarefa.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
