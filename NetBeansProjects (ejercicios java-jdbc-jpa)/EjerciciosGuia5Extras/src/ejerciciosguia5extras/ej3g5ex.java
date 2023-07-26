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
public class ej3g5ex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el tamaño del vector");
        int tamVec = sc.nextInt();

        int[] vec= llenar(tamVec);

        mostrar(vec);

    }

    public static int[] llenar(int tamVec) {
        int vec[] = new int[tamVec];
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) (Math.random() * 10);
        }
        return vec;
    }

    public static void mostrar(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " ");
        }
        System.out.println();
    }

}
