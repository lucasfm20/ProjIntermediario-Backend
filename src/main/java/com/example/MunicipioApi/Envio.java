package com.example.MunicipioApi;

public class Envio {
    private Municipio nome;
    private Municipio uf;
    private Municipio regiao;

    private int populacao;

    private float idhm;

    public Envio(Municipio nome, Municipio uf, Municipio regiao, int populacao, float idhm) {
        this.nome = nome;
        this.uf = uf;
        this.regiao = regiao;
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

    public void setIdhm(float idhm) {
        this.idhm = idhm;
    }
}
