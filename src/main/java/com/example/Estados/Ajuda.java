package com.example.Estados;

import java.util.ArrayList;

public class Ajuda {

    private String nome;

    private String projeto;

    private String site;

    private String descricao;


    public Ajuda(String nome, String projeto, String site, String descricao) {
        this.nome = nome;
        this.projeto = projeto;
        this.site = site;
        this.descricao = descricao;
    }



    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
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
