package com.example.MunicipioApi;

public class Envio {
    private Municipio nome;
    private Municipio uf;
    private Municipio regiao;
    private Municipio id;

    private int populacao;

    private int idhm;

    public Envio(Municipio id, int populacao, int idhm) {
        this.id= id;
        this.populacao = populacao;
        this.idhm = idhm;
    }

    public Municipio getNome() {
        return nome;
    }

    public void setNome(Municipio nome) {
        this.nome = nome;
    }

    public Municipio getUf() {
        return uf;
    }

    public void setUf(Municipio uf) {
        this.uf = uf;
    }

    public Municipio getRegiao() {
        return regiao;
    }

    public void setRegiao(Municipio regiao) {
        this.regiao = regiao;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public float getIdhm() {
        return idhm;
    }

    public void setIdhm(int idhm) {
        this.idhm = idhm;
    }

    public Municipio getId() {
        return id;
    }

    public void setId(Municipio id) {
        this.id = id;
    }
}
