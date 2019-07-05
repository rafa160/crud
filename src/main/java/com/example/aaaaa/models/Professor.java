package com.example.aaaaa.models;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="professor")
public class Professor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Cod_Professor")
    private Long id;

    @Column(name = "Nome_Professor")
    private String nome;

    @Column(name = "Sobrenome_Professor")
    private String sobreNome;

    @Column(name = "Status_Professor")
    private boolean status;

    @Column(name = "Cod_Departamento")
    private int codDep;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCodDep() {
        return codDep;
    }

    public void setCodDep(int codDep) {
        this.codDep = codDep;
    }


}
