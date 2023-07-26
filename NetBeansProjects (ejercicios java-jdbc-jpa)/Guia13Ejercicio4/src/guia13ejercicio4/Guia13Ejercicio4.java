/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia13ejercicio4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class Guia13Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();

        int numSecreto = random.nextInt(500) + 1;
        System.out.println(numSecreto);

        int aux = 0;
        int intentos = 1;

        while (aux != numSecreto) {

            try {
                System.out.println("Intente adivinar el numero secreto:");
                aux = sc.nextInt();

                if (aux == numSecreto) {
                    System.out.println("Encontraste el numero secreto. (" + numSecreto + ") en " + intentos + " intentos");
                    break;
                } else if (aux < numSecreto) {
                    System.out.println("El numero secreto es mayor.");
                } else {
                    System.out.println("El numero secreto es menor.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Solo se puede ingresar numeros.");
                sc.next();
            }
            intentos++;
        }

    }

}
