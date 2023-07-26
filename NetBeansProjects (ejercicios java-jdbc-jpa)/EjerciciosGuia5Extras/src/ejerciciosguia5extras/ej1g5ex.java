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
public class ej1g5ex {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el tamaño del vector");
        int tamVec = sc.nextInt();
        int vec[] = new int[tamVec];
        int suma = 0;
        
        for (int i = 0; i < vec.length; i++) {
            System.out.println("Ingrese numero en la posicion: " + (i+1));
            vec[i] = sc.nextInt();
            suma += vec[i];
        }
        
        System.out.println("La suma de los numeros en el vector es: " + suma);
        
    }
}
