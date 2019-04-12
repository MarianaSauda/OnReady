package com.company;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Moto extends Vehiculo {
    private int cilindrada;


    public Moto (String marca, String modelo, int cilindrada, double precio){
        super (marca, modelo, precio);
        this.cilindrada = cilindrada;
         }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    DecimalFormatSymbols simbolo=new DecimalFormatSymbols();
    DecimalFormat formateador = new DecimalFormat("###,##0.00",simbolo);

   public String toString(){
        return "Marca: " + getMarca() + " // Modelo: " + getModelo() + " // Cilindrada: " + getCilindrada() + "c" + " // Precio: $" +  (formateador.format(getPrecio()));

    }

}
