package com;

import java.util.Locale;

public class Electrodomestico {

    protected String consumo;
    protected String procedencia;
    protected double precio;

    public Electrodomestico(String consumo, String procedencia) {
        this.consumo = consumo;
        this.procedencia = procedencia;
        this.precio = 0;
    }

    public double getPrecio() {
        return precio;
    }

    public void precioBase() {
        consumo = consumo.toUpperCase();
        switch (consumo) {
            case "A":
                precio += 450000;
                break;
            case "B":
                precio += 350000;
                break;
            case "C":
                precio += 250000;
                break;
        }
        procedencia = procedencia.toUpperCase();
        switch (procedencia) {
            case "NACIONAL":
                precio += 250000;
                break;
            case "IMPORTADO":
                precio += 350000;
                break;
        }

    }

}