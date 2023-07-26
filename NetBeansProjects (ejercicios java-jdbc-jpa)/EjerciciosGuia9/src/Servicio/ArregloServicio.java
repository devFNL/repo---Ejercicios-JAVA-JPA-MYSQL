/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Jib
 */
public class ArregloServicio {

    public void initA(double[] array) {
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        
    //    Arrays.fill(array, (int) (Math.random() * 10));
    }

    public void mostrar(double[] array) {

        System.out.println(Arrays.toString(array));

    }

    public void ordernar(double[] array) {

        
        Arrays.sort(array);
        
        
        for (int i = 0; i < array.length / 2; i++) {
            double aux = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = aux;
        }
        
//        double[] aux = new double[array.length];
        
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                if (array[j] < array[j + 1]) {
//                    double aux = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = aux;
//                }
//            }
//        }
        

    }

    public void initB(double[] array, double[] arrayB) {

        System.arraycopy(array, 0, arrayB, 0, 9);

        Arrays.fill(arrayB, 10, arrayB.length, 0.5);

        
    }

}
