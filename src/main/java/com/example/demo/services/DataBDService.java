/*package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.Data;
import com.example.demo.repositories.DataRepository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataBDService {
    @Autowired
    static
    DataRepository dataRepository;

    public static ArrayList<Data> listDatos() {
        return (ArrayList<Data>) dataRepository.findAll();
    }

    public Data guardarDato(Data dato) {
        return dataRepository.save(dato);
    }
}
*/