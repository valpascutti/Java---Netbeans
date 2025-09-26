/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad3;

/**
 *
 * @author Manzana
 */
public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Garcia Marques", "Argentina");
        Editorial editorial = new Editorial("Sudamericana", "Buenos Aires");
        Libro libro = new Libro("Titulo libro", "32904-938120", autor, editorial);
        
        System.out.println(libro);
    }   
}
