package com.example.Estados.services;


import com.example.Estados.Estado;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class ViaEstadoService implements EstadoService{
    private RestClient client = RestClient.create("https://servicodados.ibge.gov.br/api/v1/localidades/estados");

    @Override
    public Estado converteEstado(String sigla){
        return client.get().uri("/{UF}",sigla).retrieve().body(Estado.class);
    }
}
