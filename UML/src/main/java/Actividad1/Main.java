/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad1;

/**
 *
 * @author Manzana
 */
public class Main {
    public static void main(String[] args) {
        // Ejercicio 1
        Foto foto = new Foto("imagen.jpg", "JPG");
        Titular titular = new Titular("Juan Perez", 123432003);
        Pasaporte pasaporte = new Pasaporte("A02123442", "12-03-2024", foto, titular);
        
        System.out.println(pasaporte);
        System.out.println("El pasaporte de " + titular + "es: " + titular.getPasaporte());
    } 
}

