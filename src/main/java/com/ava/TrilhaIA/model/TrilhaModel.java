package com.ava.TrilhaIA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TrilhaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long aluno_id;
    private String nome_trilha;
    private Double progresso_pct;
    private String proximo_passo;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public Long getAluno_id() { return aluno_id; }
    public void setAluno_id(Long aluno_id) { this.aluno_id = aluno_id; }
    
    public String getNome_trilha() { return nome_trilha; }
    public void setNome_trilha(String nome_trilha) { this.nome_trilha = nome_trilha; }
    
    public Double getProgresso_pct() { return progresso_pct; }
    public void setProgresso_pct(Double progresso_pct) { this.progresso_pct = progresso_pct; }
    
    public String getProximo_passo() { return proximo_passo; }
    public void setProximo_passo(String proximo_passo) { this.proximo_passo = proximo_passo; }
}
