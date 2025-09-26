/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad8;

/**
 *
 * @author Manzana
 */
public class Usuario {
    private String nombre;
    private String mail;
    
    public Usuario(String nombre, String mail) {
        this.nombre = nombre;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", mail=" + mail + '}';
    }
    
    
}
