/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionorientadaobjetos;

/**
 *
 * @author Manzana
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    private static int totalEmpleados = 0;
    
    // constructor
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    // constructor con id y salario automatico
    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados; //id automatico
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 600000;
    }
    
    // aumentar salario un porcentaje
    public void aumentarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }
    
    // aumentar salario con monto fijo
    public void aumentarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }
    
    // toString

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    // Total Empleados
    public static void mostrarTotalEmpleados() {
        System.out.println("El total de empleados es: " + totalEmpleados);
    }
    
    
    // Getters y Setters
    public int getId() {
        return id;
    }
    
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;        
        }
    }
    public String getPuesto() {
        return puesto;
    }
    
    public void setPuesto(String puesto) {
        if (puesto != null) {
            this.puesto = puesto;
        }    
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
    
    
    
    

