/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class MascotaServicio {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    private List<String> mascotas;

    public MascotaServicio() {
        this.mascotas = new ArrayList();
    }

    public void crearMascota() {

//        Con 2 datos:
//
//        System.out.println("Ingrese el nombre");
//        String nombre = sc.next();
//        System.out.println("Ingrese una raza");
//        String raza = sc.next();
//        
//        String mascota = nombre + " " + raza;
//        mascotas.add(mascota);
        
//        Con un solo tipo de dato se podria hacer asi:

        System.out.println("Ingrese una raza");
        mascotas.add(sc.next());

    }

    public void mostrarMascotas() {
        
//        For each clasico:
//
//        for (String aux : mascotas) {
//            System.out.println("Raza: " + aux);
//        }
//
//      Funcion forEach de list:
        mascotas.forEach((aux) -> {
            System.out.println("Mascota: " + aux);
        }); 
        
        
//      Lo imprime como arrays.toString:
//
//      System.out.println(mascotas.toString());

    }
    
    public void buscarMascota(){
        
        System.out.println("Ingrese una mascota a buscar");
        String buscar = sc.next();
        boolean valid = false;
        
        
        Iterator<String> it = mascotas.iterator();
        
        while (it.hasNext()) {
            
            if (it.next().equalsIgnoreCase(buscar)) {
                it.remove();
                valid = true;
                break;
            }
        }
        
        if (valid) {
            System.out.println("La raza " + buscar + " se elimino");
        } else {
            System.out.println("No se encontro la raza en la lista");
        }
        
    }

}
