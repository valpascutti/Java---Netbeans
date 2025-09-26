/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad5;

/**
 *
 * @author Manzana
 */
public class Main {
    public static void main(String[] args) {
        Propietario propietario = new Propietario("Carlos López", 33445566);
        PlacaMadre placa = new PlacaMadre("ASUS B450", "AMD B450");
        Computadora pc = new Computadora("HP", 12345653, placa, propietario);

        System.out.println(pc);
        System.out.println("La computadora de " + propietario + " es: " + propietario.getComputadora());
    }
}


