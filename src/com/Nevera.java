package com;

public class Nevera extends Electrodomestico {
    private int capacidad;


    public Nevera(int capacidad, String consumo, String procedencia) {
        super(consumo, procedencia);
        this.capacidad = capacidad;
    }

    public void calcularPrecio() {
        if (capacidad > 120) {
            precio = precio + (((capacidad - 120) / 10) * (precio * 0.05));
        }
    }
}
