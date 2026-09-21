/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carritocompras;

/**
 *
 * @author Jehudi Alvarado
 */

public class Main {
    public static void main(String[] args) {
        Carritocompras carrito = new Carritocompras();

        carrito.agregarItem(new ItemCarrito("Mouse", 2, 100));
        carrito.agregarItem(new ItemCarrito("Teclado", 1, 200));
        carrito.agregarItem(new ItemCarrito("Mouse", 3, 100));   // repetido

        System.out.println("Carrito:");
        carrito.mostrar();
        System.out.println("Total: Q" + carrito.calcularTotal());

        carrito.eliminarItem("Teclado");
        System.out.println("\nDespués de eliminar el Teclado:");
        carrito.mostrar();
        System.out.println("Total: Q" + carrito.calcularTotal());

        carrito.vaciarCarrito();
        System.out.println("\nDespués de vaciar:");
        System.out.println("Total: Q" + carrito.calcularTotal());
    }
}
