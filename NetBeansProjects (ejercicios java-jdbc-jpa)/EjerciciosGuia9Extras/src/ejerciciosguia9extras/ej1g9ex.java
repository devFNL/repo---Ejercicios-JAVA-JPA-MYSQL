/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia9extras;


import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class ej1g9ex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        String mesSecreto = meses[9];

        System.out.println("Intente adivinar el mes secreto");
        String opc = sc.next();

        while (!opc.equals(mesSecreto)) {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            opc = sc.next();

        }

        System.out.println("¡Ha acetardo!");

    }
}
