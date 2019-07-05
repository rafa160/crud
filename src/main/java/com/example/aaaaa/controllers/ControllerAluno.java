package com.example.aaaaa.controllers;


import com.example.aaaaa.dao.RepositoryAluno;
import com.example.aaaaa.models.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/aluno"})
public class ControllerAluno {

    @Autowired
    private RepositoryAluno repositoryAluno;



    ControllerAluno(RepositoryAluno repositoryAluno) {
        this.repositoryAluno = repositoryAluno;
    }

    @GetMapping
    public List findAll() {
        return repositoryAluno.findAll();
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity findById(@PathVariable long id) {
        return repositoryAluno.findById( id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Aluno create(@RequestBody Aluno aluno) {
        return repositoryAluno.save(aluno);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity update(@PathVariable("id") long id,
        @RequestBody Aluno aluno) {
        return repositoryAluno.findById(id)
                .map(record -> {
                    record.setNome(aluno.getNome());
                    record.setSobreNome(aluno.getSobreNome());
                    record.setCpf(aluno.getCpf());
                    record.setStatus(aluno.getStatus());
                    record.setCodTurma(aluno.getCodTurma());
                    record.setSexo(aluno.getSexo());
                    record.setCodCurso(aluno.getCodCurso());
                    record.setNomePai(aluno.getNomePai());
                    record.setNomeMae(aluno.getNomeMae());
                    record.setEmail(aluno.getEmail());
                    record.setWhats(aluno.getWhats());
                    Aluno updated = repositoryAluno.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path ={"/{id}"})
    public ResponseEntity<?> delete(@PathVariable long id) {
        return repositoryAluno.findById(id)
                .map(record -> {
                    repositoryAluno.deleteById( id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }






}
