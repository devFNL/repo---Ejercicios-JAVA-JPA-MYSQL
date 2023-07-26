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
public class ej4g5 {
    public static void main(String[] args) {
        
        int mat[][] = new int[3][3];
        int matInv[][] = new int[3][3];
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = (int) (Math.random()*9);
            }
        }
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("[" + mat[i][j] + "] ");
            }
            System.out.println();
        }
        
        System.out.println("***********");
        
        for (int i = 0; i < matInv.length; i++) {
            for (int j = 0; j < matInv.length; j++) {
                matInv[i][j] = mat[j][i];
            }
        }
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("[" + matInv[i][j] + "] ");
            }
            System.out.println();
        }
        
        
        
    }
}
