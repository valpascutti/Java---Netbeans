/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad1;

import Actividad1.Pasaporte;

/**
 *
 * @author Manzana
 */
public class Titular {
    String nombre;
    int dni;
    private Pasaporte pasaporte;
    
    public Titular(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;  
    }
    
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
}
