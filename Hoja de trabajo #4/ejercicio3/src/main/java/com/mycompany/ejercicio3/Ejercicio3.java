package com.mycompany.ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        
        System.out.println("Ingresa nombres (escribe \"fin\" para terminar):");

        // Ciclo para capturar nombres hasta que el usuario decida parar
        while (true) {
            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            // Agregamos el nombre a la lista
            nombres.add(nombre);
        }

        // Recorrer y mostrar la lista de nombres utilizando un bucle for-each
        System.out.println("\n--- Lista de nombres ingresados ---");
        for (String n : nombres) {
            System.out.println("- " + n);
        }

        teclado.close();
    }
}