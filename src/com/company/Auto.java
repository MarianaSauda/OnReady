package com.company;


import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Auto extends Vehiculo {
    private int puertas;

    public Auto(String marca, String modelo, int puertas, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    DecimalFormatSymbols simbolo=new DecimalFormatSymbols();
    DecimalFormat formateador = new DecimalFormat("###,##0.00",simbolo);

    public String toString() {
        return "Marca: " + getMarca() + " // Modelo: " + getModelo() + " // Puertas: " + getPuertas() + " // Precio: $" + (formateador.format(getPrecio()));

    }
}