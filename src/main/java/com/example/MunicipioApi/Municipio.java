package com.example.MunicipioApi;

public class Municipio {
    String nome;
    String UF;
    String regiao;

    public Municipio(String nome, String UF, String regiao) {
        this.nome = nome;
        this.UF = UF;
        this.regiao = regiao;
    }

    String getNome(String nome){
        return this.nome;
    }

    void setNome(){
        this.nome=nome;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
}
