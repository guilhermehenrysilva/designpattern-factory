package com.designpattern.inheritance.example.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name = "recurso_projeto")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
/**
 * Joined = Se criaria uma table para cada class {Recurso_projeto, colaborador, material} mantendo seus respectivos campos;
 * TablePerClass = Se criaria as tables {colaborador, material} com cada uma delas contendo também os campos de recurso_projeto;
 **/
@DiscriminatorColumn(name = "tipo_recurso")
public abstract class RecursoProjeto {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "custo_hora")
    private BigDecimal custoHora;

    private String responsabilidade;

}