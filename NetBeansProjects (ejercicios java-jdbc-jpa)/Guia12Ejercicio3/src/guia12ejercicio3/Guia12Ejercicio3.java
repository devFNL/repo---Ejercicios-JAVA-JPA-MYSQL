/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12ejercicio3;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jib
 */
public class Guia12Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Electrodomestico> electrodomesticos = new ArrayList();
        
        

        System.out.println("*Crear Lavadora n° 1");
        Electrodomestico e1 = new Lavadora(40, 1000, "Blanco", "D", 40);
        electrodomesticos.add(e1);
//        System.out.println("Precio de la lavadora n° 1: $" + e1.getPrecio());
        
        System.out.println("*Crear Lavadora n°2");
        Electrodomestico e2 = new Lavadora(20, 1000, "Azul", "C", 20);
        electrodomesticos.add(e2);
//        System.out.println("Precio de la lavadora n° 2: $" + e2.getPrecio());

        System.out.println("*Crear Televisor n° 1");
        Electrodomestico e3 = new Televisor(60, true, 1000, "Blanco", "F", 30);
        electrodomesticos.add(e3);
//        System.out.println("Precio del televisor n° 1: $" + e3.getPrecio());
        
        System.out.println("*Crear Televisor n° 2");
        Electrodomestico e4 = new Televisor(40, false, 1000, "Negro", "E", 20);
        electrodomesticos.add(e4);
//        System.out.println("Precio del televisor n° 2: $" + e4.getPrecio());


        int total = 0;
        
        for (Electrodomestico aux : electrodomesticos) {
            aux.precioFinal();
            System.out.println("Precio de: " + aux + " \n$"+ aux.getPrecio());
            total += aux.getPrecio();
        }
        
        System.out.println("Precio total de todos los electrodomesticos: $" + total);
        
        int totalLav = 0;
        for (Electrodomestico aux : electrodomesticos) {
            if (aux instanceof Lavadora) {
                totalLav += aux.getPrecio();
            }
        }
        System.out.println("Precio total de lavadoras: $" + totalLav);

        int totalTv = 0;
        for (Electrodomestico aux : electrodomesticos) {
            if (aux instanceof Televisor) {
                totalTv += aux.getPrecio();
            }
        }
        System.out.println("Precio total de televisores: $" + totalTv);
    }
    
}
