package com.mycompany.ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Double> calificaciones = new ArrayList<>();

        System.out.println("--- REGISTRO Y PROMEDIO DE CALIFICACIONES ---");
        System.out.println("Ingresa las calificaciones una por una.");
        System.out.println("Escribe \"fin\" cuando termines de ingresarlas.\n");

        // Ciclo para ingresar calificaciones de forma dinámica
        while (true) {
            System.out.print("Ingrese calificación (o \"fin\"): ");
            String entrada = teclado.nextLine();

            // Condición de salida
            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            try {
                // Convertimos el texto ingresado a un número decimal (Double)
                double calificacion = Double.parseDouble(entrada);
                
                // Opcional: Validar que sea una nota lógica (por ejemplo, entre 0 y 100)
                if (calificacion >= 0 && calificacion <= 100) {
                    calificaciones.add(calificacion);
                } else {
                    System.out.println("¡Aviso! Por favor ingrese una calificación válida (entre 0 y 100).");
                }
            } catch (NumberFormatException e) {
                // Si el usuario escribe letras que no sean "fin"
                System.out.println("¡Error! Entrada no válida. Ingrese un número o escriba \"fin\".");
            }
        }

        // Validamos si se ingresaron calificaciones antes de calcular el promedio
        if (calificaciones.isEmpty()) {
            System.out.println("\nNo se ingresó ninguna calificación para calcular el promedio.");
        } else {
            double suma = 0;

            // Recorremos la lista para sumar todas las calificaciones
            for (double nota : calificaciones) {
                suma += nota;
            }

            // Calculamos el promedio
            double promedio = suma / calificaciones.size();

            // Mostramos los resultados
            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Calificaciones registradas: " + calificaciones);
            System.out.println("Total de notas: " + calificaciones.size());
            System.out.printf("Promedio final: %.2f\n", promedio);
        }

        teclado.close();
    }
}