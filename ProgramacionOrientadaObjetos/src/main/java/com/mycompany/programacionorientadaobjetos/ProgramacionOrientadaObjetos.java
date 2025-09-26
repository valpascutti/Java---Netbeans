/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacionorientadaobjetos;

/**
 *
 * @author Valentina Pascutti
 */
public class ProgramacionOrientadaObjetos {

    public static void main(String[] args) {
        // crear empleados
        // constructor completo
        Empleado e1 = new Empleado(1, "Julieta Marconi", "Gerente", 970000);
        
        // Constructor automatico
        Empleado e2 = new Empleado("Nicolas Moroni", "Desarrollador Web");
        Empleado e3 = new Empleado("Valentina Pascutti", "Programador");
        
        
        // aumentar salario (porcentaje y aumento fijo)
        e1.aumentarSalario(10.0);
        e2.aumentarSalario(80000);
        e3.aumentarSalario(20.0);
        
        // mostrar info de cada empleado
        System.out.println("Empleado 1:");
        System.out.println("ID: " + e1.getId());
        System.out.println("Nombre: " + e1.getNombre());
        System.out.println("Puesto: " + e1.getPuesto());
        System.out.println("Salario: $" + e1.getSalario());

        System.out.println("\nEmpleado 2:");
        System.out.println("ID: " + e2.getId());
        System.out.println("Nombre: " + e2.getNombre());
        System.out.println("Puesto: " + e2.getPuesto());
        System.out.println("Salario: $" + e2.getSalario());
        
        System.out.println("Empleado 3:");
        System.out.println("ID: " + e3.getId());
        System.out.println("Nombre: " + e3.getNombre());
        System.out.println("Puesto: " + e3.getPuesto());
        System.out.println("Salario: $" + e3.getSalario());

        
    }
}
