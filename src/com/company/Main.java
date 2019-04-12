package com.company;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        Vehiculo vehiculo1 = new Auto("Peugeot", "206", 4, 200000.00);
        Vehiculo vehiculo2 = new Moto("Honda", "Titan", 125, 60000.00);
        Vehiculo vehiculo3 = new Auto("Peugeot", "208", 5, 250000.00);
        Vehiculo vehiculo4 = new Moto("Yamaha", "YBR", 160, 80500.50);

        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);
        vehiculos.add(vehiculo3);
        vehiculos.add(vehiculo4);


        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println(vehiculos.get(i));
        }

        System.out.println("============================");

        double elMayor = 0.00;
        String marcaMayor = " ";
        String modeloMayor = " ";

        for (int j = 0; j < vehiculos.size(); j++) {
            if (vehiculos.get(j).getPrecio() >= elMayor) {
                elMayor = vehiculos.get(j).getPrecio();
                marcaMayor = vehiculos.get(j).getMarca();
                modeloMayor = vehiculos.get(j).getModelo();
            }
        }
        System.out.println("Vehículo más caro: " + marcaMayor + " " + modeloMayor);

        double elMenor = elMayor;
        String marcaMenor = " ";
        String modeloMenor = " ";

        for (int k = 0; k < vehiculos.size(); k++) {
            if (vehiculos.get(k).getPrecio() < elMenor) {
                elMenor = vehiculos.get(k).getPrecio();
                marcaMenor = vehiculos.get(k).getMarca();
                modeloMenor = vehiculos.get(k).getModelo();
            }
        }
        System.out.println("Vehículo más barato: " + marcaMenor + " " + modeloMenor);

        String marcaConY = " ";
        String modeloConY = " ";
        double precioConY = 0.00;

        for (int l = 0; l < vehiculos.size(); l++) {
            if (vehiculos.get(l).getModelo().toLowerCase().contains("y")) {
                marcaConY = vehiculos.get(l).getMarca();
                modeloConY = vehiculos.get(l).getModelo();
                precioConY = vehiculos.get(l).getPrecio();
            }
        }

        DecimalFormatSymbols simbolo1 = new DecimalFormatSymbols();
        DecimalFormat formateador1 = new DecimalFormat("###,##0.00", simbolo1);

        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + marcaConY + " " + modeloConY + " $" + (formateador1.format(precioConY)));

        // Ejercicio Extra

        System.out.println("============================");
        System.out.println("Vehículos ordenados por precio de mayor a menor: ");

        Collections.sort(vehiculos, Vehiculo::compareTo);

        for(Vehiculo aux: vehiculos){
            System.out.println(aux.getMarca() + " " + aux.getModelo());
        }

    }
}
