package com.example.Estados;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonPropertyOrder({"uf","capital", "populacao", "idh","municipio"})
public class Postagem {

    private int populacao;

    private float idh;

    private  Estado uf;

    private String capital;

    private List<Municipio> municipio;


    public Postagem(int populacao, float idh, Estado uf, String capital,  List<Municipio> municipio) {
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

    public Estado getUf() {
        return uf;
    }

    public void setUf(Estado uf) {
        this.uf = uf;
    }
}
