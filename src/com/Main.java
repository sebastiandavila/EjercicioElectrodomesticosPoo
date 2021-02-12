package com;

import javax.swing.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        Map<Integer, Nevera> neveras = new LinkedHashMap<Integer, Nevera>();
        Map<Integer, Televisor> televisores = new LinkedHashMap<Integer, Televisor>();
        String consumo;
        String procedencia;
        String sintonizadorTv;
        int capacidadNevera;
        int pulgadas;
        int menu = 0;
        int cantidadNeveras = 0;
        int cantidadTelevisores = 0;
        double totalNeveras = 0;
        double totalTelevisores = 0;
        double valorTotal = 0;


        while (menu != 100) {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion: " +
                    "\n1. Agregar nevera vendida" +
                    "\n2. Agregar televisor vendido" +
                    "\n3. Facturar ventas" +
                    "\n100. Salir"
            ));

            switch (menu) {
                case 1:
                    capacidadNevera = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de la nevera en litros"));
                    consumo = (JOptionPane.showInputDialog("Ingrese el consumo del electrodomestico(A,B o C)"));
                    procedencia = (JOptionPane.showInputDialog("Ingrese la procedencia del electrodomestico"));
                    Nevera nevera = new Nevera(capacidadNevera, consumo, procedencia);
                    nevera.precioBase();
                    nevera.calcularPrecio();
                    JOptionPane.showMessageDialog(null, "El precio de la nevera es: $" + nevera.getPrecio());
                    neveras.put(cantidadNeveras, nevera);
                    cantidadNeveras++;
                    totalNeveras += nevera.getPrecio();
                    break;

                case 2:
                    pulgadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las pulgadas del televisor"));
                    sintonizadorTv = (JOptionPane.showInputDialog("¿tiene sintonizador TDT?(si/no) "));
                    consumo = (JOptionPane.showInputDialog("Ingrese el consumo del electrodomestico"));
                    procedencia = (JOptionPane.showInputDialog("Ingrese la procedencia del electrodomestico"));
                    Televisor televisor = new Televisor(pulgadas, sintonizadorTv, consumo, procedencia);
                    televisor.precioBase();
                    televisor.calcularPrecio();
                    JOptionPane.showMessageDialog(null, "El precio del televisor es: $" + televisor.getPrecio());
                    televisores.put(cantidadTelevisores, televisor);
                    cantidadTelevisores++;
                    totalTelevisores += televisor.getPrecio();
                    break;

                case 3:
                    valorTotal = totalNeveras + totalTelevisores;
                    JOptionPane.showMessageDialog(null, "Se vendieron " + cantidadNeveras + " neveras" +
                            " por un total de $" + totalNeveras + "\n Se vendieron " + cantidadTelevisores + " televisores" +
                            " por un total de $" + totalTelevisores + "\nEl total de las ventas es: $" + valorTotal);

                    break;
                case 100:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
            }
        }
    }

}

