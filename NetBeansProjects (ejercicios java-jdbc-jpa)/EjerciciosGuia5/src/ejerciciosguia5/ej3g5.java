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
public class ej3g5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int opc = 0;
        int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0;
        
        System.out.println("Ingrese tamaño del vector");
        int tamVec = sc.nextInt();
        
        int vec[] = new int[tamVec];
        
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) (Math.random()*10);
        }
        
        for (int i = 0; i < vec.length; i++) {
            
            while (vec[i] != 0) {
                vec[i] = (vec[i] / 10);
                opc++;
            }
            
            switch (opc) {
                case 1:
                    uno++;
                    break;
                case 2:
                    dos++;
                    break;
                case 3:
                    tres++;
                    break;
                case 4: 
                    cuatro++;
                    break;
                case 5:
                    cinco++;
                    break;
                default:
                    throw new AssertionError();
            }
            
            
        }
        
        System.out.println("Hay " + uno + " numeros de 1 digito/s");
        System.out.println("Hay " + dos + " numeros de 2 digito/s");
        System.out.println("Hay " + tres + " numeros de 3 digito/s");
        System.out.println("Hay " + cuatro + " numeros de 4 digito/s");
        System.out.println("Hay " + cinco + " numeros de 5 digito/s");
        
        
    }
   
}
