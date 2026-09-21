/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.historialnavegacion;

/**
 *
 * @author Jehudi Alvarado
 */
import java.util.ArrayList;

public class Historialnavegacion {
    private final ArrayList<String> historial = new ArrayList<>();
    private static final int LIMITE = 10;

    public void visitarPagina(String url) {
        historial.add(url);
        if (historial.size() > LIMITE) {
            historial.remove(0);
        }
    }

    public void mostrar() {
        for (String url : historial) {
            System.out.println(url);
        }
    }
}