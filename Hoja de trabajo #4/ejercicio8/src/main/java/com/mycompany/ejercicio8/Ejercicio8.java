package com.mycompany.ejercicio8;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> numerosOriginales = new ArrayList<>();
        ArrayList<Integer> numerosPares = new ArrayList<>();

        System.out.println("--- FILTRAR NÚMEROS PARES ---");
        System.out.println("Ingresa números enteros uno por uno.");
        System.out.println("Escribe \"fin\" cuando termines de ingresarlos.\n");

        // Ciclo para ingresar los números
        while (true) {
            System.out.print("Ingrese un número (o \"fin\"): ");
            String entrada = teclado.nextLine();

            // Condición de salida
            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            try {
                // Convertimos el texto ingresado a un número entero
                int numero = Integer.parseInt(entrada);
                numerosOriginales.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("¡Error! Entrada no válida. Ingrese un número entero o escriba \"fin\".");
            }
        }

        // Recorremos la lista original para filtrar solo los números pares
        for (int num : numerosOriginales) {
            // El operador módulo (%) calcula el residuo de la división entre 2. 
            // Si el residuo es 0, significa que el número es par.
            if (num % 2 == 0) {
                numerosPares.add(num);
            }
        }

        // Mostramos los resultados en pantalla
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Lista completa ingresada: " + numerosOriginales);
        System.out.println("Números pares filtrados: " + numerosPares);

        teclado.close();
    }
}