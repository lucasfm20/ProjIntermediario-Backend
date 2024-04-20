package com.example.Estados;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"uf", "populacao", "idh"})
public class Postagem {

    private int populacao;

    private int idh;

    private  Estado uf;

    public Postagem( Estado uf,int populacao, int idh) {
        this.populacao = populacao;
        this.idh = idh;
        this.uf = uf;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public int getIdh() {
        return idh;
    }

    public void setIdh(int idh) {
        this.idh = idh;
    }

    public Estado getUf() {
        return uf;
    }

    public void setUf(Estado uf) {
        this.uf = uf;
    }
}
