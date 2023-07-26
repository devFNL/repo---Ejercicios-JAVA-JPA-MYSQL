/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class NIFServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public NIF crearNif() {

        System.out.println("Ingrese su numero de DNI");
        int dni = sc.nextInt();

        int nif = dni % 23;

        String letra[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "G", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        String let = letra[nif];


        return new NIF(dni, let);

    }

    public void mostrar(NIF nif) {
        System.out.println("Su NIF es: " + nif.getDni() + "-" + nif.getLetra());
    }

}



//int num = 2;
//        String letra = "";
//        String frase = "TRWAGMYFPDXBNJZSQVHLCKE";  
//        
//        for (int i = 0; i < frase.length(); i++) {
//
//            if (i == num) {
//                letra = frase.substring(num, num+1);
//                break;
//            } 
//            
//        }
//        
//        System.out.println(letra);