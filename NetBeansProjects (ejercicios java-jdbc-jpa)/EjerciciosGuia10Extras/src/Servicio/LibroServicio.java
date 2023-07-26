/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Jib
 */
public class LibroServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    Set<Libro> libros = new HashSet();

    public Libro crearLibro() {

        System.out.println("Ingrese el titulo");
        String titulo = sc.next();
        System.out.println("Ingrese el autor");
        String autor = sc.next();

        return new Libro(titulo, autor);

    }

    public void agregarLibro() {
        libros.add(crearLibro());
    }

    public void mostrar() {
        libros.forEach((aux) -> {
            System.out.println(aux);
        });

    }

    public boolean prestamo() {
        System.out.println("Ingrese el titulo del libro a prestar: ");
        String buscar = sc.next();
        boolean valid = false;

        for (Libro aux : libros) {
            if (aux.getTitulo().equalsIgnoreCase(buscar)) {
                if (aux.getEjemplares() > aux.getEjemplaresPrestados()) {
                    aux.setEjemplares(aux.getEjemplares() - 1);
                    aux.setEjemplaresPrestados(aux.getEjemplaresPrestados() + 1);
                    valid = true;
                } else {
                    System.out.println("No hay ejemplares prestados del libro seleccionado.");
                }
            }
        }

        if (valid) {
            System.out.println("El libro se presto correctamente");
        } else {
            System.out.println("El libro no se encuentra en la libreria.");
        }
        return valid;
    }

//          version iterator   
//        public boolean prestamo(){
//        Iterator<Libro> it = libros.iterator();
//
//        while (it.hasNext()) {
//            Libro aux = it.next();
//            if (aux.getTitulo().equalsIgnoreCase(buscar)) {
//                if (aux.getEjemplares() > aux.getEjemplaresPrestados()) {
//                    aux.setEjemplares(aux.getEjemplares() - 1);
//                    aux.setEjemplaresPrestados(aux.getEjemplaresPrestados() + 1);
//                    System.out.println("El libro se presto correctamente.");
//                    return true;
//                } else {
//                    System.out.println("No quedan ejemplares disponibles para prestar.");
//                    return false;
//                }
//            }
//        }
//        System.out.println("El libro no se encuentra en la librería.");
//        return false;
    public boolean devolucion() {

        System.out.println("Ingrese el titulo del libro a devolver: ");
        String buscar = sc.next();
        boolean valid = false;

        for (Libro aux : libros) {
            if (aux.getTitulo().equalsIgnoreCase(buscar)) {
                if (aux.getEjemplaresPrestados() > 0) {
                    aux.setEjemplares(aux.getEjemplares() + 1);
                    aux.setEjemplaresPrestados(aux.getEjemplaresPrestados() - 1);
                    valid = true;
                } else {
                    System.out.println("No hay ejemplares prestados del libro seleccionado.");
                }
            }
        }
        if (valid) {
            System.out.println("El libro se devolvio correctamente.");
        } else {
            System.out.println("El libro no se encuentra en la libreria.");
        }

        return valid;
    }

    public void libreria() {

        int opc;

        do {
            System.out.println("*** Libreria ***");
            System.out.println("1. Agregar libros.");
            System.out.println("2. Mostrar libros.");
            System.out.println("3. Pedir libro.");
            System.out.println("4. Devolver libro.");
            System.out.println("5. Salir.");
            System.out.println("Ingrese una opcion: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    String resp;
                    do {

                        agregarLibro();
                        System.out.println("Desea ingresar otro libro?");
                        resp = sc.next();

                    } while (resp.equalsIgnoreCase("si"));
                    break;
                case 2:
                    mostrar();
                    break;
                case 3:
                    prestamo();
                    break;
                case 4:
                    devolucion();
                    break;
                case 5:
                    System.out.println("Saliste de la libreria.");
                    break;
                default:
                    System.out.println("Opción invalida.");
                    break;
            }

        } while (opc != 5);

    }
}
