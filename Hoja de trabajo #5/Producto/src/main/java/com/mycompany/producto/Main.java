/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto;

import java.util.ArrayList;

public class Main {

    public static void aumentarPrecios(ArrayList<Producto> lista, double porcentaje) {
        for (Producto p : lista) {
            if (p.getStock() < 10) {
                p.setPrecio(p.getPrecio() * (1 + porcentaje / 100));
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1, "Mouse", 100, 5));
        productos.add(new Producto(2, "Teclado", 200, 50));
        productos.add(new Producto(3, "Monitor", 1000, 8));

        aumentarPrecios(productos, 10);

        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}