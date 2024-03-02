package com.example.Clima;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Service {
    public String preverTempo() {
        String dadosMeteologicos = "";
        String apiUrl = "http://apiadvisor.climatempo.com.br/api/v1/anl/synoptic/locale/BR?token=8f0b8bf3ee101a723aca7c33719d3d36";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            dadosMeteologicos = responseEntity.getBody();
        } else {
            dadosMeteologicos = "Falha ao obter dados meteorológicos. Código de status: " + responseEntity.getStatusCode();
        }
        return dadosMeteologicos;
    }
}
