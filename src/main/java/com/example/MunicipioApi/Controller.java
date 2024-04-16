package com.example.MunicipioApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class Controller {
    ArrayList<Ajuda> listaAjuda =new ArrayList<>();

    @GetMapping("/")
    public String raiz(){
        return "Hello world";
    }

    @GetMapping("/ajuda")
    public ArrayList <Ajuda> ajuda(){
        Ajuda ajuda1 = new Ajuda("Lucas Fortunato Martins","Api de municípios");
        listaAjuda.add(ajuda1);
        return listaAjuda;

    }

}
