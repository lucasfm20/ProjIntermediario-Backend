package com.example.MunicipioApi;

import com.example.MunicipioApi.service.ServicoApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class Controller {
    ArrayList<Ajuda> listaAjuda =new ArrayList<>();
   @Autowired
    private ServicoApi servicoApi;
    private ArrayList<Envio> listaEnvios = new ArrayList<>();

    @GetMapping("/")
    public String raiz(){
        return "Hello world";
    }
//
    @GetMapping("/ajuda")
    public ArrayList <Ajuda> ajuda(){
        Ajuda ajuda1 = new Ajuda("Lucas Fortunato Martins","Api de municípios");
        listaAjuda.add(ajuda1);
        return listaAjuda;

    }

    @GetMapping("/envio")
    public ResponseEntity<Object> getEnvio(){
        return ResponseEntity.status(200).body(listaEnvios);
    }

    @PostMapping("/envio")
     public ResponseEntity<Object> envia(@RequestBody Envio2 envio){
        Municipio municipioId = servicoApi.converteMunicipio(envio.getId());

        Envio envio1 = new Envio(municipioId,envio.getPopulacao(),envio.getIdhm());

        listaEnvios.add(envio1);
        return ResponseEntity.status(200).body(envio1);

    }

}
