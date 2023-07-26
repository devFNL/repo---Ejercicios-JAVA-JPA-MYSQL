/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia5;

/**
 *
 * @author Jib
 */
public class ej5g5 {
    public static void main(String[] args) {
        
        int mat[][] = { { 0, -2, 4 }, { 2, 0, 2 }, { -4, -2, 0 } };
        int matInv[][] = new int[3][3];
        boolean esAnti = false;
        
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat.length; j++) {
//                mat[i][j] = (int) (Math.random()*9);
//            }
//        }
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] != (-mat[j][i])) {
                    esAnti = true;
                    break;
                }
            }
            System.out.println();
            if (!esAnti) {
                break;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("[" + mat[i][j] + "] ");
            }
            System.out.println();
        }
        
        System.out.println("***********");
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("[" + mat[j][i] + "] ");
            }
            System.out.println();
        }
        
        
        
        if (esAnti = true) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz NO es antisimetrica: ");
        }
        
    }
    
}
