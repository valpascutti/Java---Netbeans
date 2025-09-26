/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

/**
 *
 * @author Manzana
 */
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Nación", "30-12345678-9");
        Cliente cliente = new Cliente("Ana Gómez", 44556677);
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9876-5432", "12/28", banco, cliente);

        System.out.println(tarjeta);
        System.out.println("La tarjeta de " + cliente + " es: " + cliente.getTarjetaDeCredito());
    }
}
