package com.mycompany.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingresa 10 numeros enteros:");

        // Ciclo para agregar los 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Numero " + i + ": ");
            int numero = teclado.nextInt();
            numeros.add(numero);
        }

        // Imprimir todos los elementos almacenados en el ArrayList
        System.out.println("\n--- Los 10 numeros ingresados son ---");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Elemento " + (i + 1) + ": " + numeros.get(i));
        }

        teclado.close();
    }
}