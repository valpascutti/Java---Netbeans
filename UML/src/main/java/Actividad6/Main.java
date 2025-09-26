/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad6;

/**
 *
 * @author Manzana
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Lucía Fernández", 3511234567L);
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva("2025-10-01", "20:30", cliente, mesa);

        System.out.println(reserva);
        System.out.println("Cliente de la reserva: " + reserva.getCliente());
        System.out.println("Mesa asignada: " + reserva.getMesa());
    }
}
