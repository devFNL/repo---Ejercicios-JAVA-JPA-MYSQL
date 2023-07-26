/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia10;

import Servicio.PaisServicio;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class ej5g10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        PaisServicio serv = new PaisServicio();

        String resp;

        do {

            serv.agregarPais();
            System.out.println("Desea ingresar otro pais?");
            resp = sc.next();

        } while (resp.equalsIgnoreCase("si"));

        System.out.println("Lista de paises");
        serv.mostrarPaises();

        serv.eliminarPais();

    }
}
