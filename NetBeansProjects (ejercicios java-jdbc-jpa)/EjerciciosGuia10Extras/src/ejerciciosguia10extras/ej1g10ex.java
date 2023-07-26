/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia10extras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class ej1g10ex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        List<Integer> listaNum = new ArrayList();
        int num, suma = 0, prom;

        do {

            System.out.println("Ingrese un numero");
            num = sc.nextInt();
            if (num != -99) {
                listaNum.add(num);
            }

        } while (num != -99);

        System.out.println("Lista de numeros: ");
        System.out.println(listaNum.toString());

        for (Integer aux : listaNum) {
            suma += aux;
        }

        prom = (suma / listaNum.size());

        System.out.println("La cantidad de numeros ingresados es: " + listaNum.size());
        System.out.println("Suma de los numeros de la lista es: " + suma);
        System.out.println("La media de los numeros de la lista es: " + prom);

    }
}
