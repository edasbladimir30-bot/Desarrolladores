package com.mycompany.ejercicio9;

public class Empleado {
    private String nombre;
    private double salario;

    // El "this." es obligatorio para diferenciar el atributo de la clase del parámetro
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario; // <--- Revisa que tenga el "this."
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario; // <--- Asegúrate de retornar el atributo correcto
    }
}