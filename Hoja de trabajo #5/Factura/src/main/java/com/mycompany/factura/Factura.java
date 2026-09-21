/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factura;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
/**
 *
 * @author Jehudi Alvarado
 */
public class Factura {

 public static Map<String, Double> resumenPorCliente(ArrayList<Factura> facturas) {
    Map<String, Double> resumen = new LinkedHashMap<>();
    for (Factura f : facturas) {
        double acumulado = resumen.getOrDefault(f.getCliente(), 0.0);
        resumen.put(f.getCliente(), acumulado + f.getMonto());
    }
    return resumen;
}

    private final int idFactura;
    private final String cliente;
    private final double monto;

    public Factura(int idFactura, String cliente, double monto) {
        this.idFactura = idFactura;
        this.cliente = cliente;
        this.monto = monto;
    }

    public String getCliente() { return cliente; }
    public double getMonto() { return monto; }

    @Override
    public String toString() {
        return "Factura " + idFactura + " | " + cliente + " | Q" + monto;
    }
    public static void main(String[] args) {
        ArrayList<Factura> facturas = new ArrayList<>();
        facturas.add(new Factura(1, "Ana", 500));
        facturas.add(new Factura(2, "Luis", 200));
        facturas.add(new Factura(3, "Ana", 300));
        facturas.add(new Factura(4, "Marta", 1000));
        facturas.add(new Factura(5, "Luis", 150));

        Map<String, Double> resumen = resumenPorCliente(facturas);

        System.out.println("Total facturado por cliente:");
        for (Map.Entry<String, Double> e : resumen.entrySet()) {
            System.out.println(e.getKey() + ": Q" + e.getValue());
        }
    }
}


