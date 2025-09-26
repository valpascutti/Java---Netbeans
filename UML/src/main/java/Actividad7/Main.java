/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad7;

/**
 *
 * @author Manzana
 */
public class Main {
    public static void main(String[] args) {
        Conductor conductor = new Conductor("Valentina Ruiz", "A123456");
        Motor motor = new Motor("Diesel", "MTR-987654");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota Corolla", motor, conductor);
        conductor.setVehiculo(vehiculo);

        System.out.println(vehiculo);
        System.out.println("Motor: " + vehiculo.getMotor());
        System.out.println("Conductor: " + vehiculo.getConductor());
    }
}
