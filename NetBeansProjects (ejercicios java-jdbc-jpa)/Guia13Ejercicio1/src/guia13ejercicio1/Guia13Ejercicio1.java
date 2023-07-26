/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia13ejercicio1;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author Jib
 */
public class Guia13Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PersonaServicio serv = new PersonaServicio();

        Persona p1 = null;

        try {
            serv.esMayor(p1);
        } catch (Exception e) {
            System.out.println("El objeto esta vacio. Error: " + e.toString());
        }

    }

}
