/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia11;

import Entidad.Dni;
import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class guia11ej1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        Persona persona = new Persona();
        Dni dni = new Dni();
        
        System.out.println("Ingrese la serie del dni");
        dni.setSerie(sc.next().charAt(0));
        
        System.out.println("Ingrese el numero de dni");
        dni.setNum(sc.nextInt());
        
        persona.setDni(dni);
        
        System.out.println("Ingrese su nombre");
        persona.setNombre(sc.next());
        
        System.out.println("Ingrese su apellido");
        persona.setApellido(sc.next());
        
        
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println(dni.toString());
    }
}
