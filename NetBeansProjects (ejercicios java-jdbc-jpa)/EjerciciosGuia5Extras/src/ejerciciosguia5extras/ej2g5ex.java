/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia5extras;

import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class ej2g5ex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el tamaño de los vectores");
        int tamVec = sc.nextInt();

        int vec[] = new int[tamVec];
        int vec2[] = new int[tamVec];

        for (int i = 0; i < tamVec; i++) {

            vec[i] = (int) (Math.random() * 2);
            vec2[i] = (int) (Math.random() * 2);

        }

        for (int i = 0; i < tamVec; i++) {
            System.out.print(vec[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < tamVec; i++) {
            System.out.print(vec2[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < tamVec; i++) {

            if (vec[i] != vec2[i]) {
                System.out.println("Se detecto una diferencia en la posicion: " + (i));
                break;
            } else {
                System.out.println("No hay diferencia");
            }

        }

    }
}
