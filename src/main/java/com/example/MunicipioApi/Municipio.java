package com.example.MunicipioApi;

public class Municipio {
    String nome;
    String uf;
    String regiao;
    int id;

    public Municipio(String nome, String uf, String regiao, int id) {
        this.nome = nome;
        this.uf = uf;
        this.regiao = regiao;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String getNome(String nome){
        return this.nome;
    }

    void setNome(){
        this.nome=nome;
    }

    public String getUF() {
        return uf;
    }

    public void setUF(String uf) {
        this.uf = uf;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
}
