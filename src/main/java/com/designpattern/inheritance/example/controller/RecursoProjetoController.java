package com.designpattern.inheritance.example.controller;

import com.designpattern.inheritance.example.Service.RecursoProjetoService;
import com.designpattern.inheritance.example.model.RecursoProjeto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recurso-projeto")
public class RecursoProjetoController {

    @Autowired
    private RecursoProjetoService service;

    @PostMapping("/colaborador")
    public ResponseEntity<Void> inserirColaborador (){
        service.inserirColaborador();
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/material")
    public ResponseEntity<Void> inserirMaterial (){
        service.inserirMaterial();
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<RecursoProjeto>> listarRecursos (){
        return new ResponseEntity<>(service.listarTodosRecursosProjeto(), HttpStatus.OK);
    }
}
