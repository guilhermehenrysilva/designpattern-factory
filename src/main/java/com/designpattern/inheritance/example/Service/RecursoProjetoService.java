package com.designpattern.inheritance.example.Service;

import com.designpattern.inheritance.example.factory.RecursoProjetoFactory;
import com.designpattern.inheritance.example.model.Material;
import com.designpattern.inheritance.example.model.RecursoProjeto;
import com.designpattern.inheritance.example.repository.RecursoProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecursoProjetoService {

    @Autowired
    private RecursoProjetoRepository repository;

    public void InserindoObjetoFilhoMaterial(){
        RecursoProjeto RecursoMaterial = RecursoProjetoFactory.criarRecursoProjeto("material");

        Material material = (Material) RecursoMaterial;
        material.contrutorTodosCampos("todos os campos, incluindo os da classe mae");

        repository.save(material);
    }

}
