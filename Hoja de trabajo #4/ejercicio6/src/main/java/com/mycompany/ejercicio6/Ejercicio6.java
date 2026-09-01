package com.mycompany.ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> tareasPendientes = new ArrayList<>();
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
                    agregarTarea(teclado, tareasPendientes);
                    break;
                case 2:
                    mostrarTareas(tareasPendientes);
                    break;
                case 3:
                    completarYEliminarTarea(teclado, tareasPendientes);
                    break;
                case 4:
                    System.out.println("Saliendo del programa de control de tareas. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 4);

        teclado.close();
    }

    // Método para mostrar el menú principal
    public static void mostrarMenu() {
        System.out.println("\n--- CONTROL DE TAREAS PENDIENTES ---");
        System.out.println("1. Agregar nueva tarea");
        System.out.println("2. Ver tareas pendientes");
        System.out.println("3. Marcar como completada (Eliminar)");
        System.out.println("4. Salir");
        System.out.print("Elija una opción: ");
    }

    // Método para agregar una tarea
    public static void agregarTarea(Scanner teclado, ArrayList<String> tareas) {
        System.out.print("Ingrese la descripción de la tarea: ");
        String nuevaTarea = teclado.nextLine();
        tareas.add(nuevaTarea);
        System.out.println("¡Tarea agregada con éxito a los pendientes!");
    }

    // Método para mostrar la lista de tareas
    public static void mostrarTareas(ArrayList<String> tareas) {
        System.out.println("\n--- LISTA DE TAREAS PENDIENTES ---");
        if (tareas.isEmpty()) {
            System.out.println("¡Felicidades! No hay tareas pendientes por ahora.");
        } else {
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println("[" + i + "] " + tareas.get(i));
            }
        }
    }

    // Método para marcar como completada y eliminar de la lista
    public static void completarYEliminarTarea(Scanner teclado, ArrayList<String> tareas) {
        if (tareas.isEmpty()) {
            System.out.println("\nNo hay tareas pendientes para completar.");
            return;
        }

        mostrarTareas(tareas);

        System.out.print("Ingrese el número (índice) de la tarea que completó: ");
        if (teclado.hasNextInt()) {
            int indice = teclado.nextInt();
            teclado.nextLine(); // Limpiar buffer

            if (indice >= 0 && indice < tareas.size()) {
                String tareaCompletada = tareas.remove(indice);
                System.out.println("¡Excelente trabajo! Tarea completada y eliminada: \"" + tareaCompletada + "\"");
            } else {
                System.out.println("¡Error! El índice no corresponde a ninguna tarea.");
            }
        } else {
            System.out.println("¡Por favor, ingrese un número de índice válido!");
            teclado.nextLine();
        }
    }
}