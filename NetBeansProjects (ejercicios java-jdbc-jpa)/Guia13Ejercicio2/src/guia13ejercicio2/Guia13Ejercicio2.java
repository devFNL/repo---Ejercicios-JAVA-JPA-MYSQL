/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia13ejercicio2;

/**
 *
 * @author Jib
 */
public class Guia13Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] numeros = {2, 3, 5, 7, 9};

        try {
            System.out.println("El numero extra es: " + numeros[5]);
        } catch (Exception e) {
            System.out.println("El numero esta fuera de rango del arreglo");
        }

    }

}
