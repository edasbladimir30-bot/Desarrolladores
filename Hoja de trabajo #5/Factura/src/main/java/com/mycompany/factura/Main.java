/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factura;

/**
 *
 * @author Jehudi Alvarado
 */
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static Map<String, Double> resumenPorCliente(ArrayList<Factura> facturas) {
        Map<String, Double> resumen = new LinkedHashMap<>();
        for (Factura f : facturas) {
            double acumulado = resumen.getOrDefault(f.getCliente(), 0.0);
            resumen.put(f.getCliente(), acumulado + f.getMonto());
        }
        return resumen;
    }
}