/*package com.example.demo.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "datos")
public class Data {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(unique = true, nullable = false)
   private Long id;
 
   private static String dato;
 
   public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public static  String getDato() {
    return dato;
}

public void setDato(String dato) {
    this.dato = dato;
}

public Data getFecha() {
    return fecha;
}

public void setFecha(Data fecha) {
    this.fecha = fecha;
}

@Temporal(TemporalType.TIMESTAMP)
   @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
   private Data fecha; // Si no pongo fecha, la fecha será la del sistema
}*/
