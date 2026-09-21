/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.historialnavegacion;

/**
 *
 * @author Jehudi Alvarado
 */

public class Main {
    public static void main(String[] args) {
        Historialnavegacion h = new Historialnavegacion();

        for (int i = 1; i <= 12; i++) {
            h.visitarPagina("www.pagina" + i + ".com");
        }

        System.out.println("Historial actual:");
        h.mostrar();
    }
}