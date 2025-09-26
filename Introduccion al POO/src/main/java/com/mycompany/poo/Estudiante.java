/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

public class POO {
    public static void main(String[] args) {
        // --- ESTUDIANTE ---
        Estudiante a = new Estudiante();
        a.nombre = "Valentina";
        a.apellido = "Pascutti";
        a.curso = "Comision 3";
        a.calificacion = 7;
        a.mostrarInfo();
        a.subirCalificacion();
        a.mostrarInfo();
        a.bajarCalificacion();
        a.mostrarInfo();

        // --- MASCOTA ---
        Mascotas m = new Mascotas();
        m.nombre = "Mocca";
        m.especie = "Perro";
        m.edad = 1;
        m.mostrarInfo();
        m.cumplirAnios();
        m.mostrarInfo();

        // --- LIBRO ---
        Libro libro1 = new Libro();
        libro1.setTitulo("Cien años de soledad");
        libro1.setAutor("Gabriel García Márquez");
        libro1.setAnioPublicacion(1967);

        libro1.mostrarInfo();

        // Intentar modificar con un valor inválido
        libro1.setAnioPublicacion(3000);

        // Modificar con un valor válido
        libro1.setAnioPublicacion(1980);

        libro1.mostrarInfo();
        
        // GALLINAS
        Gallina g1 = new Gallina();
g1.idGallina = 1;
g1.edad = 2;
g1.huevosPuestos = 0;

Gallina g2 = new Gallina();
g2.idGallina = 2;
g2.edad = 1;
g2.huevosPuestos = 0;

// Simulamos acciones
g1.ponerHuevo();
g1.ponerHuevo();
g1.envejecer();

g2.ponerHuevo();
g2.envejecer();
g2.envejecer();

// Mostramos estados finales
g1.mostrarEstado();
g2.mostrarEstado();
    }
}
