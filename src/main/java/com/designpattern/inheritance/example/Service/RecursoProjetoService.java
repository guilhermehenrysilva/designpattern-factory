package com.designpattern.inheritance.example.Service;

import com.designpattern.inheritance.example.factory.RecursoProjetoFactory;
import com.designpattern.inheritance.example.model.Colaborador;
import com.designpattern.inheritance.example.model.RecursoProjeto;
import com.designpattern.inheritance.example.repository.RecursoProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class RecursoProjetoService {

    @Autowired
    private RecursoProjetoRepository repository;

    public void inserirColaborador(){
        RecursoProjeto RecursoMaterial = RecursoProjetoFactory.criarRecursoProjeto("colaborador");
        Colaborador colaborador = (Colaborador) RecursoMaterial;

        colaborador.setNome("Arrascaeta");
        colaborador.setEmail("email@email.com");
        colaborador.setResponsabilidade("Mestre de obras"); //Classe mae
        colaborador.setCustoHora(new BigDecimal(100)); //Classe mae

        repository.save(colaborador);
    }

    public void inserirMaterial(){
        RecursoProjeto RecursoMaterial = RecursoProjetoFactory.criarRecursoProjeto("material");
        repository.save(RecursoMaterial);
    }

    public List<RecursoProjeto> listarTodosRecursosProjeto(){
        return repository.findAll();
    }
}
