/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad2;

/**
 *
 * @author Manzana
 */
public class Main {
    public static void main(String[] args) {
        Bateria bateria = new Bateria("Samsung-BA123", 5000);
        Usuario usuario = new Usuario("María López", 98765432); // ahora dni es int
        Celular celular = new Celular(123456789, "Samsung", "Galaxy S24", bateria, usuario);

        System.out.println(celular);
        System.out.println("El celular de " + usuario + " es: " + usuario.getCelular());
    }
}
