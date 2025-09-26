/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad14;

/**
 *
 * @author Manzana
 */
public class Main {
    public static void main(String[] args) {
        Proyecto p = new Proyecto("Intro Animada", 5);
        EditorVideo editor = new EditorVideo();
        editor.exportar("MP4", p);
    }
}
