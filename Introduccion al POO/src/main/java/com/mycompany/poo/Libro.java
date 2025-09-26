/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author Manzana
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0 && anioPublicacion <= 2025) { // validación básica
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("❌ Año inválido: " + anioPublicacion);
        }
    }
    
    void mostrarInfo() {
        System.out.println("Título: " + titulo + " | Autor: " + autor + " | Año: " + anioPublicacion);
    }
}
