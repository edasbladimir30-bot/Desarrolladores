/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carritocompras;

import java.util.ArrayList;

public class Carritocompras {
    private final ArrayList<ItemCarrito> items = new ArrayList<>();

    public void agregarItem(ItemCarrito nuevo) {
        for (ItemCarrito item : items) {
            if (item.getProducto().equalsIgnoreCase(nuevo.getProducto())) {
                item.setCantidad(item.getCantidad() + nuevo.getCantidad());
                return;
                
                
        }
    
        
        }
        items.add(nuevo);
    }

    public void eliminarItem(String producto) {
        items.removeIf(i -> i.getProducto().equalsIgnoreCase(producto));
    }

    public void vaciarCarrito() {
        items.clear();
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrito item : items) {
            total += item.getCantidad() * item.getPrecioUnitario();
        }
        return total;
    }

    public void mostrar() {
        for (ItemCarrito item : items) {
            System.out.println(item);
        }
    }
    
}