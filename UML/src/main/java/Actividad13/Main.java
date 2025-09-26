/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad13;

/**
 *
 * @author Manzana
 */
public class Main {
    public static void main(String[] args) {
        Usuario u = new Usuario("Ana Torres", "ana@gmail.com");
        GeneradorQR generador = new GeneradorQR();
        generador.generar("ABC123XYZ", u);
    }
}
