package com.example.Estados;

import java.util.List;

public class Solicitacao {

    private int populacao;
    private float idh;

    private String uf;

    private String capital;

    private List<Municipio> municipio;

    public Solicitacao(int populacao, float idh, String uf, String capital,  List<Municipio> municipio) {
        this.populacao = populacao;
        this.idh = idh;
        this.uf = uf;
        this.capital = capital;
        this.municipio = municipio;
    }

    public  List<Municipio> getMunicipio() {
        return municipio;
    }

    public void setMunicipio( List<Municipio> municipio) {
        this.municipio = municipio;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public float getIdh() {
        return idh;
    }

    public void setIdh(float idh) {
        this.idh = idh;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
