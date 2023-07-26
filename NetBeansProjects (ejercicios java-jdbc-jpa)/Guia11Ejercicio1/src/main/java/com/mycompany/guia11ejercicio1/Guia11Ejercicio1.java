/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.guia11ejercicio1;

import Entidad.Perro;
import Entidad.Persona;
//import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class Guia11Ejercicio1 {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Perro perr1 = new Perro("Fingo", "Collie", 10, "Grande");
        Perro perr2 = new Perro("Maven", "Bulldog", 3, "Mediano");

        Persona pers1 = new Persona("Federico", "Lindberg", 29, 37320297, perr1);
        Persona pers2 = new Persona("Manuel", "Ceballos", 30, 37320256, perr2);

        pers1.mostrar();
        pers2.mostrar();

//        System.out.println("Ingrese el nombre del perro 1");
//        perr1.setNombre(sc.next());
//        System.out.println("Ingrese la raza del perro 1");
//        perr1.setRaza(sc.next());
//        System.out.println("Ingrese la edad del perro 1");
//        perr1.setEdad(sc.nextInt());
//        System.out.println("Ingrese el tamaño del perro 1");
//        perr1.setTamano(sc.next());
//        
//        System.out.println("Ingrese el nombre de la persona 1");
//        pers1.setNombre(sc.next());
//        System.out.println("Ingrese el apellido de la persona 1");
//        pers1.setApellido(sc.next());
//        System.out.println("Ingrese la edad de la persona 1");
//        pers1.setEdad(sc.nextInt());
//        System.out.println("Ingrese el dni de la persona 1");
//        pers1.setDni(sc.nextInt());
//        pers1.setPerro(perr1);
//        
//        System.out.println("Ingrese el nombre del perro 2");
//        perr2.setNombre(sc.next());
//        System.out.println("Ingrese la raza del perro 2");
//        perr2.setRaza(sc.next());
//        System.out.println("Ingrese la edad del perro 2");
//        perr2.setEdad(sc.nextInt());
//        System.out.println("Ingrese el tamaño del perro 2");
//        perr2.setTamano(sc.next());
//        
//        System.out.println("Ingrese el nombre de la persona 2");
//        pers2.setNombre(sc.next());
//        System.out.println("Ingrese el apellido de la persona 2");
//        pers2.setApellido(sc.next());
//        System.out.println("Ingrese la edad de la persona 2");
//        pers2.setEdad(sc.nextInt());
//        System.out.println("Ingrese el dni de la persona 2");
//        pers2.setDni(sc.nextInt());
//        pers2.setPerro(perr2);
    }
}
