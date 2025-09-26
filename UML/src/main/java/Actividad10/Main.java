/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad10;

/**
 *
 * @author Manzana
 */
public class Main {
    public static void main(String[] args) {
        ClaveSeguridad clave = new ClaveSeguridad(1234, "25/09/2025");
        CuentaBancaria cuenta = new CuentaBancaria(1234567890123456L, 50000, clave, null);
        Titular titular = new Titular("Ana Pérez", 12345678, cuenta);
        cuenta = new CuentaBancaria(1234567890123456L, 50000, clave, titular); // actualizar titular en la cuenta

        System.out.println(titular);
        System.out.println(cuenta);
    }
}
