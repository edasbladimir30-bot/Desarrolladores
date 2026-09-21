/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fucionlistas;

import java.util.ArrayList;

/**
 *
 * @author Jehudi Alvarado
 */
public class FucionListas {

    public static ArrayList<Integer> fusionar(ArrayList<Integer> a, ArrayList<Integer> b) {
    ArrayList<Integer> resultado = new ArrayList<>();
    int i = 0, j = 0;

    while (i < a.size() && j < b.size()) {
        if (a.get(i) <= b.get(j)) {
            resultado.add(a.get(i));
            i++;
        } else {
            resultado.add(b.get(j));
            j++;
        }
    }

    while (i < a.size()) {
        resultado.add(a.get(i));
        i++;
    }
    while (j < b.size()) {
        resultado.add(b.get(j));
        j++;
    }

    return resultado;
}
    public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<>();
    a.add(1);
    a.add(4);
    a.add(7);
    a.add(10);

    ArrayList<Integer> b = new ArrayList<>();
    b.add(2);
    b.add(3);
    b.add(9);

    ArrayList<Integer> resultado = fusionar(a, b);

    System.out.println("Lista A: " + a);
    System.out.println("Lista B: " + b);
    System.out.println("Fusionada: " + resultado);
}
}