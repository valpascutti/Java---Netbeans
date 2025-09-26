/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad10;

/**
 *
 * @author Manzana
 */
public class Titular {
    private String nombre;
    private int dni;
    private CuentaBancaria cuentaBancaria;

    public Titular(String nombre, int dni, CuentaBancaria cuentaBancaria) {
        this.nombre = nombre;
        this.dni = dni;
        this.cuentaBancaria = cuentaBancaria;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + ", cuentaBancaria=" + cuentaBancaria + '}';
    }
    
    
}
