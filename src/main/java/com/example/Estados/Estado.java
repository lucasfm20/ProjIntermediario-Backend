package com.example.Estados;

import java.util.ArrayList;

public class Estado {

    private String sigla;
    private String nome;

    private Regiao regiao;



    public Estado(String sigla, String nome, Regiao regiao) {
        this.sigla = sigla;
        this.nome = nome;
        this.regiao = regiao;

    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
