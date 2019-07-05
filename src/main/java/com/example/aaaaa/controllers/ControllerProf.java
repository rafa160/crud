package com.example.aaaaa.controllers;


import com.example.aaaaa.dao.RepositoryProf;
import com.example.aaaaa.models.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/professor"})
public class ControllerProf {


    @Autowired
    private RepositoryProf repositoryProf;

    ControllerProf(RepositoryProf repositoryProf){
        this.repositoryProf = repositoryProf;
    }

    @GetMapping
    public List findAll() {
        return repositoryProf.findAll();
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity findById(@PathVariable long id) {
        return repositoryProf.findById( id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }


    @PostMapping
    public Professor create(@RequestBody Professor professor) {
        return repositoryProf.save(professor);
    }


    @DeleteMapping(path ={"/{id}"})
    public ResponseEntity<?> delete(@PathVariable long id) {
        return repositoryProf.findById(id)
                .map(record -> {
                    repositoryProf.deleteById( id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }


    @PutMapping(value = "/{id}")
    public ResponseEntity update(@PathVariable("id") long id,
                                 @RequestBody Professor professor) {
        return repositoryProf.findById(id)
                .map(record -> {
                    record.setNome(professor.getNome());
                    record.setSobreNome(professor.getSobreNome());
                    record.setStatus(professor.isStatus());
                    record.setCodDep(professor.getCodDep());
                    Professor updated = repositoryProf.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }




}
