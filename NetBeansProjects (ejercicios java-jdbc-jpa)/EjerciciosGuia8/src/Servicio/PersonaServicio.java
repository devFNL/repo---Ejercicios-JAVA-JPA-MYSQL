/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class PersonaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.next();

        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        while (edad < 0 || edad > 120) {
            System.out.println("Error. Ingrese una edad valida");
            edad = sc.nextInt();
        }

        System.out.println("Ingrese su sexo: (H/M/O) ");
        String sexo = sc.next();

        while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O")) {
            System.out.println("Error. Ingrese H/M/O");
            sexo = sc.next();
        }

        System.out.println("Ingrese su peso: ");
        int peso = sc.nextInt();
        System.out.println("Ingrese su altura: ");
        double altura = sc.nextDouble();

        return new Persona( nombre,  edad,  sexo,  peso,  altura);
    }

    public boolean esMayor(Persona pers) {
        boolean mayor;

        if (pers.getEdad() > 18) {
//            System.out.println("La persona es mayor de edad");
            mayor = true;
        } else {
//            System.out.println("La persona es menor de edad");
            mayor = false;
        }
        return mayor;
    }

    public int calcularIMC(Persona pers) {
        int retu;
        double imc = (pers.getPeso() / Math.pow(pers.getAltura(), 2));
        if (imc < 20) {
//            System.out.println("La persona esta por debajo de su peso ideal");
            retu = -1;
        } else if (imc > 25) {
//            System.out.println("La persona esta por encima de su peso ideal");
            retu = 1;
        } else {
//            System.out.println("La persona esta en su peso ideal");
            retu = 0;
        }
        return retu;
    }

//    public int[] edades(Persona a, Persona b, Persona c, Persona d){
//        int edades[] = {a.getEdad(), b.getEdad(), c.getEdad(), d.getEdad()};
//        return edades;
//    }
}
