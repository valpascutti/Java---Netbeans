/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();

    // Agregar producto al inventario
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    // Listar todos los productos
    public void listarProductos() {
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    // Buscar producto por ID
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    // Eliminar producto por ID
    public void eliminarProducto(String id) {
        productos.removeIf(p -> p.getId().equals(id));
    }

    // Actualizar cantidad de un producto existente
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado para " + p.getId() + ": " + nuevaCantidad);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    // Filtrar productos por categoría
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
            }
        }
    }

    // Obtener total de stock (sumatoria de cantidades)
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    // Obtener el producto con mayor cantidad en stock
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;
        Producto max = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > max.getCantidad()) {
                max = p;
            }
        }
        return max;
    }

    // Filtrar productos por rango de precio
    public void filtrarProductosPorPrecio(double min, double max) {
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
            }
        }
    }

    // Mostrar todas las categorías disponibles
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c + ": " + c.getDescripcion());
        }
    }
}
