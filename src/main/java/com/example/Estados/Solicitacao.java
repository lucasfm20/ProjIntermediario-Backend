package com.example.Estados;

public class Solicitacao {

    private int populacao;
    private int idh;

    private String uf;

    public Solicitacao( String uf,int populacao, int idh) {
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
