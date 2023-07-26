/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia10;

import Servicio.PeliculaServicio;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class ej4g10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        PeliculaServicio serv = new PeliculaServicio();

        String resp;

        do {

            serv.agregarPeli();
            System.out.println("Desea ingresar otra pelicula?");
            resp = sc.next();

        } while (resp.equalsIgnoreCase("si"));

        System.out.println("Lista de peliculas");
        serv.mostrarPeli();

        System.out.println("Lista de peliculas mayores a 1hr");
        serv.ordenDuracion1Hr();
        
        serv.ordenar();

    }

}
