package com.example.MunicipioApi.service;

import com.example.MunicipioApi.Municipio;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class ViaServicoApi implements ServicoApi{
    private RestClient client =RestClient.create("https://servicodados.ibge.gov.br/api/v1/localidades/estados");
    @Override
    public Municipio converteMunicipio(String uf) {
        return client.get().uri("/{UF}/municipios)",uf).retrieve().body(Municipio.class);
    }
}
