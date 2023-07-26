/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia10;

import Servicio.MascotaServicio;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class ej1g10 {

    public static void main(String[] args) {
        
        

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        

        MascotaServicio serv = new MascotaServicio();
        String resp;

        do {

            serv.crearMascota();
            System.out.println("Desea ingresar otra mascota?");
            resp = sc.next();

        } while (resp.equalsIgnoreCase("si"));
        
        serv.mostrarMascotas();

    }

}
