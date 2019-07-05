package com.example.aaaaa.dao;


import com.example.aaaaa.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositoryAluno extends JpaRepository<Aluno, Long> {}