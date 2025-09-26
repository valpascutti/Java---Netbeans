/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

/**
 *
 * @author Manzana
 */
public class TarjetaDeCredito {
    private String numero; // String para poder poner guiones
    private String fechaVencimiento;
    private Banco banco;   // agregación
    private Cliente cliente; // asociación bidireccional

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco, Cliente cliente) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
        this.cliente = cliente;
        cliente.setTarjetaDeCredito(this); // relación bidireccional
    }

    public Banco getBanco() {
        return banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + 
                "numero=" + numero + 
                ", fechaVencimiento=" + fechaVencimiento + 
                ", banco=" + banco + 
                ", cliente=" + cliente + 
                '}';
    }
}

