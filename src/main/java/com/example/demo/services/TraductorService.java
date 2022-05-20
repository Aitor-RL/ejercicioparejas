package com.example.demo.services;

import com.example.demo.models.Person;
import com.example.demo.models.ResponseData;
import com.example.demo.models.Traducir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class TraductorService {
    @Autowired

    ResponseData responseData;
    
    public static Traducir traducirFrase(String frase){ 
        String url = "https://api.mymemory.translated.net/get?q="+ frase +"&langpair=es|en";
        Traducir traducir = ResponseData.getForObject(url, Traducir.class);


        return traducir;
       
    }

}