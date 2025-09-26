/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad10;

/**
 *
 * @author Manzana
 */
public class ClaveSeguridad {
    private int codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(int codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{" + "codigo=" + codigo + ", ultimaModificacion=" + ultimaModificacion + '}';
    }
    
    
}
