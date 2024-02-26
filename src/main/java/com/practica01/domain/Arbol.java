/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica01.domain;


import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "arbol")

public class Arbol implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id_arbol") 
    private long idArbol;
    private String nombre;
    private String tamano;
    private String color;
    private String ruta_imagen;
    private boolean activo;

    public Arbol() {
    }

    public Arbol(String nombre, boolean activo) {
        this.nombre = nombre;
        this.activo = activo;
    }

}
