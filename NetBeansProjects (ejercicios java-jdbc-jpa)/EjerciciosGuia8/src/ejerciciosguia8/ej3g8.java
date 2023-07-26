/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia8;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author Jib
 */
public class ej3g8 {
    public static void main(String[] args) {
        
        int ideal = 0, sobre = 0, debajo = 0;
        int menor = 0, mayor = 0;
        
        PersonaServicio serv = new PersonaServicio();
        Persona uno = serv.crearPersona();
        Persona dos = serv.crearPersona();
        Persona tres = serv.crearPersona();
        Persona cuatro = serv.crearPersona();
        
//        System.out.println("Primera persona edad: " + serv.esMayor(uno));
//        System.out.println("Segunda persona edad: " + serv.esMayor(dos));
//        System.out.println("Tercera persona edad: " + serv.esMayor(tres));
//        System.out.println("Cuarta persona edad: " + serv.esMayor(cuatro));
//        
//        System.out.println("Primera persona IMC: " + serv.calcularIMC(uno));
//        System.out.println("Segunda persona IMC: " + serv.calcularIMC(dos));
//        System.out.println("Tercera persona IMC: " + serv.calcularIMC(tres));
//        System.out.println("Cuarta persona IMC: " + serv.calcularIMC(cuatro));
        
        boolean edades[] = {serv.esMayor(uno), serv.esMayor(dos), serv.esMayor(tres), serv.esMayor(cuatro)};
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] == true) {
                mayor++;
            } else {
                menor++;
            }
        }
        
        int indices[] = {serv.calcularIMC(uno), serv.calcularIMC(dos), serv.calcularIMC(tres), serv.calcularIMC(cuatro)};
        for (int i = 0; i < indices.length; i++) {
            if (indices[i] == -1) {
                debajo ++;
            } else if (indices[i] == 1) {
                sobre ++;               
            } else {
                ideal ++;
            }
        }
        
        System.out.println("En el grupo de personas hay: " + mayor + " mayores de edad. (" + (mayor*100/4) + "%)");
        System.out.println("En el grupo de personas hay: " + menor + " menores de edad. (" + (menor*100/4) + "%)");
        System.out.println("En el grupo de personas hay: " + debajo + " debajo de su peso ideal. (" + (debajo*100/4) + "%)");
        System.out.println("En el grupo de personas hay: " + sobre + " sobre de su peso ideal. (" + (sobre*100/4) + "%)");
        System.out.println("En el grupo de personas hay: " + ideal + " con su peso ideal. (" + (ideal*100/4) + "%)");
        

//        int edades[] = serv.edades(uno, dos, tres, cuatro);
        
        
    }
    
}
