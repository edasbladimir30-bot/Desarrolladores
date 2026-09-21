/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleado;

/**
 *
 * @author Jehudi Alvarado
 */

    import java.util.ArrayList;

public class Main {

    public static ArrayList<Empleado> filtrar(ArrayList<Empleado> lista, String departamento) {
        ArrayList<Empleado> resultado = new ArrayList<>();
        for (Empleado e : lista) {
            if (e.getDepartamento().equalsIgnoreCase(departamento) && e.getSalario() > 5000) {
                resultado.add(e);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Ana", "Ventas", 6000));
        empleados.add(new Empleado("Luis", "Ventas", 4500));
        empleados.add(new Empleado("Marta", "TI", 8000));
        empleados.add(new Empleado("Pedro", "Ventas", 5000));
        empleados.add(new Empleado("Sofia", "Ventas", 7200));

        ArrayList<Empleado> filtrados = filtrar(empleados, "Ventas");

        System.out.println("Empleados de Ventas con salario mayor a Q5,000:");
        for (Empleado e : filtrados) {
            System.out.println(e);
        }
    }
}