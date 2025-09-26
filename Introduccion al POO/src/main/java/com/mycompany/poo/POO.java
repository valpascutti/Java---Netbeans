/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo;

import java.util.Scanner;

/**
 *
 * @author Manzana
 */
public class POO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudiante a = new Estudiante();
        a.nombre = "Valentina";
        a.apellido = "Pascutti";
        a.curso = "Comision 3";
        a.calificacion = 7;

        a.mostrarInfo(); // mostrar info inicial

        System.out.println("Elige una opción: ");
        System.out.println("1 - Subir calificación");
        System.out.println("2 - Bajar calificación");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            a.subirCalificacion();
            System.out.println("Se subió la calificación.");
        } else if (opcion == 2) {
            a.bajarCalificacion();
            System.out.println("Se bajó la calificación.");
        } else {
            System.out.println("Opción inválida.");
        }

        // Mostrar info final
        a.mostrarInfo();

        
        // MASCOTAS
        Mascotas m = new Mascotas();
        m.nombre = "Mocca";
        m.especie = "Perro";
        m.edad = 1;
        
        System.out.println("\nDatos de la mascota: ");
        m.mostrarInfo();
        
        m.cumplirAnios();
        System.out.println("Cumplió años y ahora tiene: ");
        m.mostrarInfo();
        
        
        sc.close();
        
        // NAVE ESPACIAL
NaveEspacial nave = new NaveEspacial();
nave.nombre = "Apollo";
nave.combustible = 50; 
nave.despegar();
nave.avanzar(20);  
nave.avanzar(40);  

nave.recargarCombustible(60); 
nave.avanzar(30);   

nave.mostrarEstado();

    }
}