package com.mycompany.producto;


public class Producto {
    private final int id;
    private final String nombre;
    private double precio;
    private final int stock;

    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public int getStock() { return stock; }

    @Override
    public String toString() {
        return id + " - " + nombre + " | Q" + precio + " | stock: " + stock;
    }
}
