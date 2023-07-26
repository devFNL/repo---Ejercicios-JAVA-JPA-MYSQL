/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.guia11ejercicioextra1;

import Entidad.Perro;
import Entidad.Persona;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Jib
 */
public class Guia11EjercicioExtra1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        Set<Perro> adoptados = new HashSet();
        Set<Perro> perros = new HashSet();
        Set<Persona> personas = new HashSet();

        String respPerro = null, respPersona = null;

        // Lista de perros
        do {

            System.out.println("* Ingrese datos del perro *");
            System.out.println("Ingrese nombre");
            String nombre = sc.next();
            System.out.println("Ingrese raza");
            String raza = sc.next();
            System.out.println("Ingrese edad");
            int edad = sc.nextInt();
            System.out.println("Ingrese tamaño");
            String tamano = sc.next();

            perros.add(new Perro(nombre, raza, edad, tamano));

            System.out.println("Desea agregar otro perro ?");
            respPerro = sc.next();

        } while (respPerro.equalsIgnoreCase("si"));

        System.out.println("Lista de perros: ");

        for (Perro aux : perros) {
            System.out.println(aux);
        }

        // Lista de personas
        do {

            System.out.println("* Ingrese datos de la persona *");
            System.out.println("Ingrese nombre");
            String nombre = sc.next();
            System.out.println("Ingrese apellido");
            String apellido = sc.next();
            System.out.println("Ingrese edad");
            int edad = sc.nextInt();
            System.out.println("Ingrese dni");
            int dni = sc.nextInt();

            personas.add(new Persona(nombre, apellido, edad, dni));

            System.out.println("Desea agregar otra persona ?");
            respPersona = sc.next();

        } while (respPersona.equalsIgnoreCase("si"));

        System.out.println("Lista de personas: ");

        for (Persona aux : personas) {
            System.out.println(aux);
        }

        // Adoptar
        
        for (Persona auxPers : personas) {
            while (auxPers.getPerro() == null) {
                System.out.println(auxPers.getNombre() + " ingrese nombre del perro a adoptar");
                String elecc = sc.next();

                Perro adop = null;

                for (Perro aux : perros) {
                    if (aux.getNombre().equalsIgnoreCase(elecc)) {
                        adop = aux;
                        break;
                    }
                }

                if (adop != null && !adoptados.contains(adop)) {
                    perros.remove(adop);
                    adoptados.add(adop);
                    auxPers.setPerro(adop);
                    System.out.println(auxPers.getNombre() + " adoptaste a: " + adop.getNombre());
                } else {
                    System.out.println("El perro no se encuentra en la lista o ya ha sido adoptado. Ingrese otro nombre");
                }
            }
        }

        // Mostrar info
        System.out.println("Personas y sus perros:");
        System.out.println(personas.toString());

    }
}
