package com.designpattern.inheritance.example.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("colaborador")
public class Colaborador extends RecursoProjeto {

    private String nome;

    private String email;
}