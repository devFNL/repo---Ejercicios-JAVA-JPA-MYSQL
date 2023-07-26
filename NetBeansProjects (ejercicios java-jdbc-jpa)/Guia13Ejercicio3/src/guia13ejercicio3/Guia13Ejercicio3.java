/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia13ejercicio3;

import static java.lang.Integer.parseInt;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class Guia13Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        String num1 = "";
        String num2 = "";
        int n1 = 0;
        int n2 = 0;
        double division = 0;

        try {
            System.out.println("Ingrese el primer número: ");
            num1 = sc.next();

            System.out.println("Ingrese el segundo número: ");
            num2 = sc.next();

            n1 = parseInt(num1);
            n2 = parseInt(num2);
            division = n1 / n2;
            System.out.println("La división es: " + division);
        } catch (NumberFormatException e) {
            System.out.println("El valor ingresado no es un numero valido. " + "Error: " + e.toString());
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir un numero por cero. " + "Error: " + e.toString());
        } catch (InputMismatchException e) {
            System.out.println("Error de entrada. Ingrese un número valido. " + "Error: " + e.toString());
        } finally {
            System.out.println("Fin del programa.");
        }

    }
}
