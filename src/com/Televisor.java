package com;

public class Televisor extends Electrodomestico {
    protected int pulgadas;
    protected String sintonizador;


    public Televisor(int pulgadas, String sintonizador, String consumo, String procedencia) {
        super(consumo, procedencia);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public void calcularPrecio() {
        if (pulgadas > 40)
            precio += precio * 0.30;

        if (sintonizador.equalsIgnoreCase("Si"))
            precio += 250000;


    }


}
