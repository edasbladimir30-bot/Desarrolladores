package com.mycompany.ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> elementos = new ArrayList<>();
        int opcion = 0;

        do {
            mostrarMenu();

            if (teclado.hasNextInt()) {
                opcion = teclado.nextInt();
                teclado.nextLine(); // Limpiar el buffer
            } else {
                System.out.println("¡Por favor, ingrese un número válido!");
                teclado.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    agregarElemento(teclado, elementos);
                    break;
                case 2:
                    mostrarElementos(elementos);
                    break;
                case 3:
                    eliminarElemento(teclado, elementos);
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 4);

        teclado.close();
    }

    // Método para mostrar el menú principal
    public static void mostrarMenu() {
        System.out.println("\n--- MENÚ DE ELEMENTOS ---");
        System.out.println("1. Agregar elemento");
        System.out.println("2. Mostrar elementos");
        System.out.println("3. Eliminar elemento por índice");
        System.out.println("4. Salir");
        System.out.print("Elija una opción: ");
    }

    // Método para agregar un elemento a la lista
    public static void agregarElemento(Scanner teclado, ArrayList<String> elementos) {
        System.out.print("Ingrese el elemento a agregar: ");
        String nuevoElemento = teclado.nextLine();
        elementos.add(nuevoElemento);
        System.out.println("¡Elemento agregado con éxito!");
    }

    // Método para mostrar todos los elementos de la lista
    public static void mostrarElementos(ArrayList<String> elementos) {
        System.out.println("\n--- Lista de Elementos ---");
        if (elementos.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            for (int i = 0; i < elementos.size(); i++) {
                System.out.println("Índice [" + i + "] -> " + elementos.get(i));
            }
        }
    }

    // Método para eliminar un elemento según su índice
    public static void eliminarElemento(Scanner teclado, ArrayList<String> elementos) {
        if (elementos.isEmpty()) {
            System.out.println("\nNo hay elementos para eliminar. La lista está vacía.");
            return;
        }

        mostrarElementos(elementos);

        System.out.print("Ingrese el índice del elemento que desea eliminar: ");
        if (teclado.hasNextInt()) {
            int indice = teclado.nextInt();
            teclado.nextLine(); // Limpiar buffer

            if (indice >= 0 && indice < elementos.size()) {
                String eliminado = elementos.remove(indice);
                System.out.println("¡Se ha eliminado el elemento: \"" + eliminado + "\" con éxito!");
            } else {
                System.out.println("¡Error! Índice fuera de rango. Verifique los índices disponibles.");
            }
        } else {
            System.out.println("¡Por favor, ingrese un número de índice válido!");
            teclado.nextLine();
        }
    }
}