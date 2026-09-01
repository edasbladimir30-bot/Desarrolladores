package com.mycompany.ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        System.out.println("--- REGISTRO DE EMPLEADOS Y PROMEDIO DE SALARIOS ---");
        System.out.println("Ingresa los datos. Escribe \"fin\" en el nombre para terminar.\n");

        // Ciclo para capturar empleados de forma dinámica
        while (true) {
            System.out.print("Ingrese el nombre del empleado (o \"fin\"): ");
            String nombre = teclado.nextLine().trim();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Ingrese el salario de " + nombre + ": ");
            String entradaSalario = teclado.nextLine().trim();

            try {
                // Convertimos el texto ingresado a un número decimal (Double) de forma segura
                double salario = Double.parseDouble(entradaSalario);

                if (salario >= 0) {
                    // Creamos el objeto Empleado y lo guardamos en la lista
                    Empleado nuevoEmpleado = new Empleado(nombre, salario);
                    listaEmpleados.add(nuevoEmpleado);
                    System.out.println("¡Empleado registrado con éxito!\n");
                } else {
                    System.out.println("¡Error! El salario no puede ser negativo. Intente de nuevo.\n");
                }

            } catch (NumberFormatException e) {
                System.out.println("¡Error! Ingrese un valor numérico válido para el salario.\n");
            }
        }

        // Verificamos si se ingresaron empleados para calcular el promedio
        if (listaEmpleados.isEmpty()) {
            System.out.println("\nNo se registró ningún empleado.");
        } else {
            double sumaSalarios = 0;

            // Recorremos la lista de objetos Empleado para sumar sus salarios
            for (Empleado emp : listaEmpleados) {
                sumaSalarios += emp.getSalario();
            }

            // Calculamos el promedio
            double promedio = sumaSalarios / listaEmpleados.size();

            // Mostramos los resultados finales
            System.out.println("\n--- RESULTADOS FINALES ---");
            System.out.println("Total de empleados registrados: " + listaEmpleados.size());
            System.out.printf("Suma total de salarios: %.2f\n", sumaSalarios);
            System.out.printf("Promedio de salarios: %.2f\n", promedio);
        }

        teclado.close();
    }
}