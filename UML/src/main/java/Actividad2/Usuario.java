/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad2;

import Actividad2.Celular;

/**
 *
 * @author Manzana
 */
public class Usuario {
    private String nombre;
    private int dni;
    private Celular celular;
    
    public Usuario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        
    }
    
    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public Celular getCelular() {
        return celular;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
}
