package com.designpattern.inheritance.example.repository;

import com.designpattern.inheritance.example.model.RecursoProjeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecursoProjetoRepository extends JpaRepository<RecursoProjeto, Integer> {
}
