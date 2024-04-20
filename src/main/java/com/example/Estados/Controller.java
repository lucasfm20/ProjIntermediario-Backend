package com.example.Estados;

import com.example.Estados.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private EstadoService estadoService;
    private ArrayList<Postagem> listaDePostagems = new ArrayList<>();

    private  ArrayList<Ajuda> listaAjuda = new ArrayList<>();


    @GetMapping("/ajuda")

    public ArrayList <Ajuda> ajuda(){

        Ajuda ajuda1 =new Ajuda("Lucas Fortunato Martins","API de estados","https://servicodados.ibge.gov.br/api/docs/localidades","Projeto de API feito para manipular dados a API do IBGE.");

        listaAjuda.add(ajuda1);

        return listaAjuda;
    }

    @GetMapping("/postar")
    public ResponseEntity<Object> recupera() {
        return ResponseEntity.status(200).body(listaDePostagems);
    }

    @PostMapping("/postar")
    public ResponseEntity<Object> postar(@RequestBody Solicitacao solicitacao) {
        Estado uf = estadoService.converteEstado(solicitacao.getUf());
        List<Municipio> listaMunicipio = solicitacao.getMunicipio();

        Postagem postagem = new Postagem(
                solicitacao.getPopulacao(),
                solicitacao.getIdh(),
                uf,
                solicitacao.getCapital(),
                listaMunicipio
        );
        listaDePostagems.add(postagem);
        return ResponseEntity.status(200).body(postagem);
    }
}
