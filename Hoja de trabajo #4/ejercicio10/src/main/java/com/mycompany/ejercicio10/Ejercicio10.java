package com.mycompany.ejercicio10;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio10 {

    public static void main(String[] args) {
        ArrayList<Integer> numerosAleatorios = new ArrayList<>();
        Random random = new Random();

        // Generar 20 números aleatorios (por ejemplo, entre 1 y 100)
        for (int i = 0; i < 20; i++) {
            // nextInt(100) genera un número entre 0 y 99. Le sumamos 1 para que sea del 1 al 100.
            int numero = random.nextInt(100) + 1;
            numerosAleatorios.add(numero);
        }

        // Imprimir la lista completa con los 20 números
        System.out.println("--- 20 NÚMEROS ALEATORIOS GENERADOS ---");
        System.out.println(numerosAleatorios);

        // Opcional: Imprimirlos uno por uno con su posición (índice)
        System.out.println("\n--- Detalle por posición ---");
        for (int i = 0; i < numerosAleatorios.size(); i++) {
            System.out.println("Índice [" + i + "] -> " + numerosAleatorios.get(i));
        }
    }
}