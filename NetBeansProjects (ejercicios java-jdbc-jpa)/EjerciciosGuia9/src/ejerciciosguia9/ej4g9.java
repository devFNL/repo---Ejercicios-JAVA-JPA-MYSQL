/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia9;

import Servicio.FechaServicio;
import java.util.Date;

/**
 *
 * @author Jib
 */
public class ej4g9 {
    
    public static void main(String[] args) {
         
        FechaServicio serv = new FechaServicio();
        
        Date fechaNac = serv.fechaNacimiento();
        Date fechaAct = serv.fechaActual();
        System.out.println("La fecha actual es: " + fechaAct);
        
        System.out.println("Ingrese una segunda fecha de nacimiento");
        Date fechaNac2 = serv.fechaNacimiento();
        int edad = serv.diferencia(fechaNac, fechaNac2);
        
        System.out.println("La diferencia de edad es de: " + edad);
        
        
    }
}
