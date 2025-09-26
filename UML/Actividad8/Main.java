/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad8;

/**
 *
 * @author Manzana
 */
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Ana Gómez", "ana.gomez@mail.com");
        FirmaDigital firma = new FirmaDigital("ABC123HASH", "2025-09-25", usuario);
        Documento documento = new Documento("Contrato de Alquiler", "Este es el contenido del contrato...", firma);

        System.out.println(documento);
        System.out.println("Firmado por: " + documento.getFirmaDigital().getUsuario().getNombre());
    }
}