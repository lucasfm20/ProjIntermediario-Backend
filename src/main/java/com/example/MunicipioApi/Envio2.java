package com.example.MunicipioApi;

public class Envio2 {
private int id;
private int populacao;

private int idhm;

    public Envio2(int id, int populacao, int idhm) {
        this.id = id;
        this.populacao = populacao;
        this.idhm = idhm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public int getIdhm() {
        return idhm;
    }

    public void setIdhm(int idhm) {
        this.idhm = idhm;
    }
}
