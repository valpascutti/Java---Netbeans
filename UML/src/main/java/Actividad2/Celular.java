/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad2;

import Actividad2.Bateria;
import Actividad2.Celular;

/**
 *
 * @author Manzana
 */
public class Celular {
    private int imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;
    
    public Celular(int imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;
        usuario.setCelular(this);
    } 

    public Bateria getBateria() {
        return bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + ", usuario=" + usuario + '}';
    }
    
    
}
