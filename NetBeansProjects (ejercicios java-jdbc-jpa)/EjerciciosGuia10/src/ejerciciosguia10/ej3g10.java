/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia10;

import Servicio.AlumnoServicio;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class ej3g10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        AlumnoServicio serv = new AlumnoServicio();
        
        String resp;
        
        do {            
            
            serv.agregarAlumno();
            System.out.println("Desea ingresar otro alumno?");
            resp = sc.next();
            
        } while (resp.equalsIgnoreCase("si"));
        
        
        System.out.println("Ingrese alumno para calcular el promedio");
        String buscar = sc.next();
        
        serv.notaFinal(buscar);
        
        
    }
}
