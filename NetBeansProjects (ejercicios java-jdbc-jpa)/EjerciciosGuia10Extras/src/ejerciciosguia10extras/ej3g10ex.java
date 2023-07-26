/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia10extras;

import Servicio.LibroServicio;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class ej3g10ex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        LibroServicio serv = new LibroServicio();

        serv.libreria();
    }
}
