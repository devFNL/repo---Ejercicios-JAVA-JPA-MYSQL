/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12ejercicio1;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.Lancha;
import Entidad.Velero;
import Entidad.Yate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class Guia12Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        List<Barco> barcos = new ArrayList();

        Barco b1 = new Velero(3, 51234, 14, 2020);
        Barco b2 = new Lancha(500, 3245, 6, 2019);
        Barco b3 = new Yate(10, 4500, 293, 20, 2021);
        
        barcos.add(b1);
        barcos.add(b2);
        barcos.add(b3);

        Alquiler alquiler = new Alquiler("Francisco", 2345123, new Date(123, 5, 8), new Date(123, 5, 23), 4, b3);

        System.out.println("Lista de barcos disponibles para alquiler: ");
        for (int i = 0; i < barcos.size(); i++) {
            System.out.println((i+1) + " - " + barcos.get(i).getClass().getSimpleName() + ". " +  barcos.get(i).toString());
            
        }

        System.out.println("Que barco desea alquilar?");
        int opc = sc.nextInt();
        switch (opc) {
            case 1:
                alquiler.setBarco(b1);
                break;
            case 2:
                alquiler.setBarco(b2);
                break;
            case 3:
                alquiler.setBarco(b3);
                break;
            default:
                throw new AssertionError();
        }

        double precioAlquiler = alquiler.calcularPrecio();

        System.out.println("El precio de su alquiler es de: $" + precioAlquiler);
        System.out.println(b1.getClass().getSimpleName());

    }

}
