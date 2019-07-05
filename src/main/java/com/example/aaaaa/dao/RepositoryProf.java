package com.example.aaaaa.dao;


import com.example.aaaaa.models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryProf extends JpaRepository<Professor, Long> {}