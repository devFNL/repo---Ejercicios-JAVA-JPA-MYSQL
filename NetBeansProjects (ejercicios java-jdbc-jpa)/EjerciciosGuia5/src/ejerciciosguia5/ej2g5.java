/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class ej2g5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        int tamVec;
        int num;
        int rep = 0;

        System.out.println("Ingrese el tamaño del vector");
        tamVec = sc.nextInt();

        int vec[] = new int[tamVec];

        System.out.println("Ingrese un numero para buscar en el vector");
        num = sc.nextInt();

        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) (Math.random() * 10);
            if (num == vec[i]) {
                rep++;
                System.out.println("El numero esta en la posicion: " + i);
            }
        }

        if (rep > 1) {
            System.out.println("El numero esta repetido");
        } else if (rep < 1) {
            System.out.println("El numero no se encuentra en el vector");
        }
        

    }
}
