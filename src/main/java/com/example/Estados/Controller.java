package com.example.Estados;

import com.example.Estados.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller {

    @Autowired
    private EstadoService estadoService;
    private ArrayList<Postagem> listaDePostagems = new ArrayList<>();

    @GetMapping("/postar")
    public ResponseEntity<Object> recupera() {
        return ResponseEntity.status(200).body(listaDePostagems);
    }

    @PostMapping("/postar")
    public ResponseEntity<Object> postar(@RequestBody Solicitacao solicitacao) {
        Estado uf = estadoService.converteEstado(solicitacao.getUf());

        Postagem postagem = new Postagem(
                uf,
                solicitacao.getPopulacao(),
                solicitacao.getIdh()
        );
        listaDePostagems.add(postagem);
        return ResponseEntity.status(200).body(postagem);
    }
}
