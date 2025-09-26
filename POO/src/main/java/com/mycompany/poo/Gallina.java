/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author Manzana
 */
public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;
    
    
    void ponerHuevo() {
        huevosPuestos += 1;
        System.out.println("La gallina" + idGallina + " puso un huevo. Toral: " + huevosPuestos);
    }
    
    void envejecer() {
        edad += 1;
        System.out.println("La gallina " + idGallina + " cumplió un año. Ahora tiene " + edad + " años.");
    }
    
    void mostrarEstado() {
        System.out.println("Gallina " + idGallina + " | Edad: " + edad + " | Huevos puestos: " + huevosPuestos);
    }}
