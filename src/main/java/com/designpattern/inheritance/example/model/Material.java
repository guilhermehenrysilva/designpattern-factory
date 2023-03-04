package com.designpattern.inheritance.example.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@DiscriminatorValue("material")
public class Material extends RecursoProjeto {

    private String descricao;

    public void contrutor(String descricao){
        this.descricao = descricao;
    }

    public void contrutorTodosCampos(String descricao){
        this.descricao = descricao;
        this.setResponsabilidade("responsabilidade");
        this.setCustoHora(new BigDecimal(100));
    }
}
