/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad5;

/**
 *
 * @author Manzana
 */
public class Propietario {
    private String nombre;
    private int dni;
    private Computadora computadora;
    
    
    public Propietario(String nombre, int dni) {
    this.nombre = nombre;
    this.dni = dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
}
