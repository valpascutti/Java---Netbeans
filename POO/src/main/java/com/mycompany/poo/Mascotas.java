/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author Manzana
 */
public class Mascotas {
    String nombre;
    String especie;
    int edad;
    
    void mostrarInfo () {
        System.out.println(nombre + " " + especie + " " + edad +" ");
    }
    
    int cumplirAnios () {
        edad += 1;
        return edad;
    }
}
