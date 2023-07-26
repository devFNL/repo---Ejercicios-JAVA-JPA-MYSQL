/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia9;

import Servicio.ArregloServicio;

/**
 *
 * @author Jib
 */
public class ej3g9 {

    public static void main(String[] args) {

        double[] arrA = new double[50];
        double[] arrB = new double[20];

        ArregloServicio serv = new ArregloServicio();

        serv.initA(arrA);
        System.out.println("Array A: ");
        serv.mostrar(arrA);

        serv.ordernar(arrA);
        System.out.println("Array A ordenado: ");
        serv.mostrar(arrA);

        serv.initB(arrA, arrB);

        System.out.println("Arreglo A:");
        serv.mostrar(arrA);
        System.out.println("Arreglo B:");
        serv.mostrar(arrB);
    }

}
