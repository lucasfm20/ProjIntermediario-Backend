package com.example.MunicipioApi;

public class Ajuda {
    String nome;
    String projeto;

    public Ajuda(String nome, String projeto) {
        this.nome = nome;
        this.projeto = projeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
}
