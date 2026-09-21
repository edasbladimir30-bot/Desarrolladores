/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empleado;

/**
 *
 * @author Jehudi Alvarado
 */
public class Empleado {
    private final String nombre;
    private final String departamento;
    private final double salario;

    public Empleado(String nombre, String departamento, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getDepartamento() { return departamento; }
    public double getSalario() { return salario; }

    @Override
    public String toString() {
        return nombre + " | " + departamento + " | Q" + salario;
    }
}

   
