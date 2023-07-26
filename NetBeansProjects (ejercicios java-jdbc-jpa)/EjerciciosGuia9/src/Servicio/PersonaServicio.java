/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class PersonaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        System.out.println("Ingrese el nombre");
        String nombre = sc.next();

        System.out.println("Ingrese la fecha de nacimiento: (DD - MM - AA)");
        int dd = sc.nextInt();
        int mm = sc.nextInt();
        int aa = sc.nextInt();

        Date fecha = new Date(aa, mm - 1, dd);

        return new Persona(nombre, fecha);

    }

    public int calcularEdad(Persona pers) {

//        LocalDate fechaNac = pers.getFechaNac().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        LocalDate fechaAct = LocalDate.now();
        
        Date fechaHoy = new Date();
        Date fechaNac = pers.getFechaNac();
        
        int edad = fechaHoy.getYear() - pers.getFechaNac().getYear(); 

//        Period peri = Period.between(fechaNac, fechaAct);
//
//        int edad = peri.getYears();

        System.out.println("La edad es: " + edad);
        return edad;
    }

    public boolean menorQue(Persona pers, int edad) {

        System.out.println("Ingrese una edad para consultar si la persona es mayor o menor");
        int edadCons = sc.nextInt();

        boolean menor = edad < edadCons;
        System.out.println("La persona es menor a la edad consultada?: " + menor);

        return menor;
    }

    public void mostrarPersona(Persona pers) {
        System.out.println("Nombre de la persona: " + pers.getNombre());
        System.out.println("Fecha de nacimiento: " + pers.getFechaNac());
        System.out.println("Edad: " + calcularEdad(pers));

    }

}
