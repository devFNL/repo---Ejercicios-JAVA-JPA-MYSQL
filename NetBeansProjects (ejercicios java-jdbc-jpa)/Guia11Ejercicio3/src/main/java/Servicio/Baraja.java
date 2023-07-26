/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Jib
 */
public class Baraja {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    Set<Carta> cartas = new HashSet<>();
    Set<Carta> repartidas = new HashSet<>();
    List<Carta> listaCartas;

    
    public void crearBaraja() {
        for (int i = 0; i < 40; i++) {
            this.cartas.add(new Carta());
        }
        this.listaCartas = new ArrayList<>(cartas);
    }

//    public void mostrarLista() {
//        for (Carta aux : listaCartas) {
//            System.out.println(aux);
//        }
//    }
    
    public void mostrarRepartidas() {
        if (repartidas.isEmpty()) {
            System.out.println("No se repartio ninguna carta");
        } else {

            for (Carta aux : repartidas) {
                System.out.println(aux);
            }
        }
    }

    public void mostrar() {
        for (Carta aux : cartas) {
            System.out.println(aux);
        }
    }

    public void barajar() {

        Collections.shuffle(listaCartas);
        this.cartas = new HashSet<>(listaCartas);
    }

    public void siguienteCarta() {

        Iterator<Carta> it = cartas.iterator();

        Carta aux = it.next();

        while (it.hasNext()) {
            this.cartas.remove(aux);
            this.repartidas.add(aux);
            break;
        }

    }

    public void cartasDisponibles() {
        
        int dispo = cartas.size();

        System.out.println("El numero de cartas disponibles es: " + dispo);
    }

    public void darCartas() {

        System.out.println("Cuantas cartas desea retirar?");
        int pedir = sc.nextInt();

        if (pedir > cartas.size()) {
            System.out.println("No hay esa cantidad de cartas disponibles");
        } else {

            Iterator<Carta> it = this.cartas.iterator();

            for (int i = 0; i < pedir; i++) {
                Carta aux = it.next();
                it.remove();
                this.repartidas.add(aux);
            }
        }
    }

    public void menu() {

        int opc;

        do {
            System.out.println("*** Juego de Cartas ***");
            System.out.println("1. Crear baraja.");
            System.out.println("2. Mostrar baraja.");
            System.out.println("3. Mezclar baraja.");
            System.out.println("4. Siguiente carta.");
            System.out.println("5. Repartir cartas.");
            System.out.println("6. Mostrar numero de cartas disponibles.");
            System.out.println("7. Mostrar cartas repartidas.");
            System.out.println("8. Mostrar cartas restantes.");
            System.out.println("9. Salir.");
            System.out.println("Ingrese una opcion: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    crearBaraja();
                    break;
                case 2:
                    mostrar();
                    break;
                case 3:
                    barajar();
                    break;
                case 4:
                    System.out.println("Retirando 1 carta");
                    siguienteCarta();
                    break;
                case 5:
                    System.out.println("Repartiendo cartas...");
                    darCartas();
                    break;
                case 6:
                    System.out.println("Cantidad de cartas para repartir:");
                    cartasDisponibles();
                    break;
                case 7:
                    System.out.println("Cartas repartidas:");
                    mostrarRepartidas();
                    break;
                case 8:
                    System.out.println("Cartas disponibles:");
                    mostrar();
                    break;
                case 9:
                    System.out.println("Saliste.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }

        } while (opc != 9);

    }
}
