package com.designpattern.inheritance.example.factory;

import com.designpattern.inheritance.example.model.Colaborador;
import com.designpattern.inheritance.example.model.Material;
import com.designpattern.inheritance.example.model.RecursoProjeto;

public class RecursoProjetoFactory {

    public static RecursoProjeto criarRecursoProjeto(String ObjectType) {
        switch (ObjectType){
            case "material":
                System.out.println("Returning new Material");
                return new Material("tijolo");

            case "colaborador":
                System.out.println("Returning new Colaborador");
                return new Colaborador();

            default:
                System.out.println("Object not found");
        }
        return null;
    }

}
