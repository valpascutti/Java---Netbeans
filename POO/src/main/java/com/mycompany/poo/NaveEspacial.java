/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

public class NaveEspacial {
    String nombre;
    int combustible;         // combustible actual
    int capacidadMaxima = 100; // máximo que puede almacenar
    
    void despegar() {
        if (combustible > 0) {
            System.out.println("La nave " + nombre + " ya despego.");
        } else {
            System.out.println("No hay combustible para despegar.");
        }
    }
    
    void avanzar(int distancia) {
        int consumo = distancia * 2; // cada unidad de distancia consume 2 de combustible
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println("La nave avanzó " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println("Combustible insuficiente" + distancia + " km.");
        }
    }
    
    void recargarCombustible(int cantidad) {
        if (combustible + cantidad > capacidadMaxima) {
            combustible = capacidadMaxima;
            System.out.println("Combustible recargado al máximo (" + capacidadMaxima + ").");
        } else {
            combustible += cantidad;
            System.out.println("Combustible recargado. Actual: " + combustible);
        }
    }
    
    void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "/" + capacidadMaxima);
    }
}
