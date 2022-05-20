package com.example.demo.controllers;

import java.util.ArrayList;

import com.example.demo.models.Traducir;
import com.example.demo.services.TraductorService;

//import com.example.demo.models.Data;


//import com.example.demo.services.DataBDService;
import com.example.demo.utils.Utils;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

//import java.io.File;


@RestController
public class Ejercicio {

   


    // http://localhost:8080/
    @GetMapping("/")
    public String greet() {
        return "Bienvenido al servidor backend";
    }

    // http://localhost:8080/contar/ana
    @GetMapping("/contar/{name}")
    public String palindrome(@PathVariable String name) {
        String contarLetras = Utils.ContarLetras(name);
        return contarLetras;
    }
    
    /*@GetMapping("/listarDatos")
   public String jokeList(){
        ArrayList<Data> datos = DataBDService.listDatos();
        String listado = "";
        for(Data data: datos){
            listado += Data.getDato();
            
            listado += "<br/>";
        }
        return listado;
   }
*/




/*4- Cuando el cliente acceda a la dirección:
http://localhost:8080/BBBB*/
@GetMapping("/invertir/{name}")
public String darVuelta(@PathVariable String name) {
    String invertir = Utils.darLaVuelta(name);
    return invertir;

}


/*5-
Cuando un cliente acceda a la dirección:
http://localhost:8080/traduce/Hola que tal*/


//http://localhost:8080/traducir/{name}
@GetMapping("/traducir/{name}")
public String traducirIngles(@PathVariable String frase){
    String traduccion ="";
    Traducir c = TraductorService.traducirFrase(frase);

    traduccion = "La frase" + frase + " = " + c +".";

    return traduccion;
   
}

}