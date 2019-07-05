package com.example.aaaaa.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "aluno")
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "RA")
    private Long id;

    @Column(name = "Nome_Aluno")
    private String nome;

    @Column(name = "Sobrenome_Aluno")
    private String sobreNome;

    @Column(name = "CPF")
    private String cpf;

    @Column(name = "Status_Aluno")
    private String status;

    @Column(name = "Cod_Turma")
    private int codTurma;

    @Column(name = "Sexo")
    private String sexo;

    @Column(name ="Cod_Curso")
    private int codCurso;

    @Column(name = "Nome_Pai")
    private String nomePai;

    @Column(name = "Nome_mae")
    private String nomeMae;

    @Column(name = "Email")
    private String email;

    @Column(name = "Whatsapp")
    private String whats;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCodTurma() {
        return codTurma;
    }

    public void setCodTurma(int codTurma) {
        this.codTurma = codTurma;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWhats() {
        return whats;
    }

    public void setWhats(String whats) {
        this.whats = whats;
    }


}
