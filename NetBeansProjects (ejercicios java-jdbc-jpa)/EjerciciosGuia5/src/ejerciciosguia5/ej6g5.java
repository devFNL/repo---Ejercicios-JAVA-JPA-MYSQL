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
public class ej6g5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int matMag[][] = new int[3][3];

        System.out.println("Ingrese los valores para el cuadrado magico");
        for (int i = 0; i < matMag.length; i++) {
            for (int j = 0; j < matMag.length; j++) {

                matMag[i][j] = sc.nextInt();

            }

        }

        for (int i = 0; i < matMag.length; i++) {
            for (int j = 0; j < matMag.length; j++) {
                System.out.print("[" + matMag[i][j] + "] ");
            }
            System.out.println();
        }

        int suma = (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9) / 3;

        for (int i = 0; i < matMag.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matMag.length; j++) {
                sumaFila += matMag[i][j];
            }
            if (sumaFila != suma) {
                System.out.println("El cuadrado no es magico");
            }
        }

        for (int i = 0; i < matMag.length; i++) {
            int sumaColumna = 0;
            for (int j = 0; j < matMag.length; j++) {
                sumaColumna += matMag[i][j];
            }
            if (sumaColumna != suma) {
                System.out.println("El cuadrado no es magico");
            }
        }

        int sumaDiag1 = matMag[0][0] + matMag[1][1] + matMag[2][2];
        int sumaDiag2 = matMag[0][2] + matMag[1][1] + matMag[2][0];

        if (sumaDiag1 != suma || sumaDiag2 != suma) {
            System.out.println("El cuadrado no es magico");
        } else {
            System.out.println("El cuadrado es magico");
        }

    }
}
