/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

/**
 *
 * @author Manzana
 */
public class Cliente {
    private String nombre;
    private int dni;
    private TarjetaDeCredito tarjetaDeCredito; // asociación bidireccional

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
}
