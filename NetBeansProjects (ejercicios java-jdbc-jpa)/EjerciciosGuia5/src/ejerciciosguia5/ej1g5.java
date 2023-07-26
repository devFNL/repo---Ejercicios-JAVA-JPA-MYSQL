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
public class ej1g5 {

    public static void main(String[] args) {

        int vec[] = new int[100];

        for (int i = 99; i >= 0; i--) {
            vec[i] = i;
            System.out.println(vec[i]);
        }
    }
}
