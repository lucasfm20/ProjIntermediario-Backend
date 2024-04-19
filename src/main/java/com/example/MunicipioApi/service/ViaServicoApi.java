package com.example.MunicipioApi.service;

import com.example.MunicipioApi.Municipio;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class ViaServicoApi implements ServicoApi{
    private RestClient client =RestClient.create("https://servicodados.ibge.gov.br/api/v1/localidades/municipios");
    @Override
    public Municipio converteMunicipio(int id) {
        return client.get().uri("/{municipio})",id).retrieve().body(Municipio.class);
    }
}
