/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad9;

/**
 *
 * @author Manzana
 */
public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Ana Pérez", "OSDE");
        Profesional profesional = new Profesional("Dr. López", "Cardiología");
        CitaMedica cita = new CitaMedica("25/09/2025", "10:00", paciente, profesional);

        System.out.println(cita);
    }
}


