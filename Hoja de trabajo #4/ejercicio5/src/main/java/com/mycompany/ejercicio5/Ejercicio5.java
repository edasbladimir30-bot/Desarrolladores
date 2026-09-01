package com.mycompany.ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        
        // Agregamos algunos nombres iniciales de ejemplo para hacer la prueba
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Sofia");
        nombres.add("Luis");
        nombres.add("Bladimir");

        System.out.println("Lista actual de nombres: " + nombres);

        System.out.print("\nIngrese el nombre que desea buscar en la lista: ");
        String nombreBuscado = teclado.nextLine();

        // Verificamos si la lista contiene el nombre usando contains()
        // Nota: contains distingue entre mayúsculas y minúsculas por defecto.
        if (nombres.contains(nombreBuscado)) {
            System.out.println("¡Éxito! El nombre \"" + nombreBuscado + "\" SÍ existe en la lista.");
        } else {
            System.out.println("Lo siento, el nombre \"" + nombreBuscado + "\" NO se encuentra en la lista.");
        }

        teclado.close();
    }
}