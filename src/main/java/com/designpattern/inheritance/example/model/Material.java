package com.designpattern.inheritance.example.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@DiscriminatorValue("material")
@NoArgsConstructor
public class Material extends RecursoProjeto {

    private String descricao;

    public Material(String descricao) {
        this.descricao = descricao;
        this.setCustoHora(new BigDecimal(10)); //Classe mae
        this.setResponsabilidade("mestre arrascaeta"); //Classe mae
    }
}
