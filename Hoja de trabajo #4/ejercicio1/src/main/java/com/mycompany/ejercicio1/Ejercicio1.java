package com.mycompany.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String elemento;
        
        // Crea ciclo que se repite indefinidamente
        while (true) {
            System.out.print("Ingrese un elemento: ");
            elemento = teclado.nextLine();

            if (elemento.equalsIgnoreCase("fin")) { // Pregunta si el usuario escribió fin
                break; // Rompe el ciclo
            }

            System.out.println("Ingresaste: " + elemento);
        }

        System.out.println("Programa terminado.");
        teclado.close();
    }
}