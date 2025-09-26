/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad11;

/**
 *
 * @author Manzana
 */
public class Main {
    public static void main(String[] args) {
        Artista artista = new Artista("Justin Bieber", "Pop");
        Cancion cancion = new Cancion("Never say Never", artista);
        Reproductor reproductor = new Reproductor();

        reproductor.reproducir(cancion);
    }
}

