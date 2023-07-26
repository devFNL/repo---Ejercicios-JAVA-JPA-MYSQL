/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alojamiento;
import Entidad.Camping;
import Entidad.Hotel;
import Entidad.Hotel4;
import Entidad.Hotel5;
import Entidad.Residencia;
import static Utilidades.HotelComparator.ordenarPorPrecio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class AlojamientoServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    List<Alojamiento> alojas = new ArrayList();

    public void llenarLista() {

        alojas.add(new Hotel4("B", "Resto-1", 60, 30, 120, 3, "Hotel-1(4)", "Direccion-1", "Localidad-1", "Gerente-1"));
        alojas.add(new Hotel4("A", "Resto-2", 80, 50, 200, 5, "Hotel-2(4)", "Direccion-2", "Localidad-2", "Gerente-2"));
        alojas.add(new Hotel5(2, 10, 10, "A", "Resto-3", 120, 40, 160, 4, "Hotel-3(5)", "Direccion-3", "Localidad-3", "Gerente-3"));
        alojas.add(new Hotel5(6, 30, 30, "A", "Resto-4", 300, 200, 400, 10, "Hotel-4(5)", "Direccion-4", "Localidad-4", "Gerente-4"));
        alojas.add(new Camping(60, 10, false, false, 300, "Camping-1(r)", "Ruta-1", "Pueblo-1", "GerenteCamping-1"));
        alojas.add(new Camping(100, 20, true, true, 900, "Camping-2(s/r)", "Ruta-2", "Pueblo-2", "GerenteCamping-2"));
        alojas.add(new Residencia(20, true, true, true, 500, "Resi-1(d)", "Calle-1", "Ciudad-1", "GerenteResi-1"));
        alojas.add(new Residencia(50, false, false, false, 900, "Resi-2(s/d)", "Calle-2", "Ciudad-2", "GerenteResi-2"));

    }

    public void preciar() {

        for (Alojamiento aux : alojas) {
            if (aux instanceof Hotel) {
                ((Hotel) aux).precioFinal();
            }
        }

    }

    public void mostrarAlojamientos() {

        for (Alojamiento aux : alojas) {
            System.out.println(aux.toString());
        }

    }

    public void mostrarHoteles() {

        // de menor a mayor.
        // hoteles.sort(Comparator.comparing(Hotel::getPrecio)
        // de mayor a menor.
        // hoteles.sort(Comparator.comparing(Hotel::getPrecio)
        //              .reversed()
        List<Hotel> hoteles = new ArrayList();
        for (Alojamiento aux : alojas) {
            if (aux instanceof Hotel) {
                hoteles.add((Hotel) aux);
            }
        }

        System.out.println("Lista de hoteles ordenados de mayor a menor precio: ");
        Collections.sort(hoteles, ordenarPorPrecio);
        for (Hotel aux : hoteles) {
            System.out.println(aux.toString());
        }

    }

    public void mostrarCampings() {

        System.out.println("Lista de campings que tienen restaurant: ");

        for (Alojamiento aux : alojas) {
            if (aux instanceof Camping) {
                if (((Camping) aux).isResto()) {
                    System.out.println(aux);
                }
            }
        }

    }

    public void mostrarResidencias() {

        System.out.println("Lista de residencias que tienen descuento: ");
        for (Alojamiento aux : alojas) {
            if (aux instanceof Residencia) {
                if (((Residencia) aux).isDescuento()) {
                    System.out.println(aux);
                }
            }
        }

    }

    public void menu() {

        llenarLista();
        preciar();

        int opc;

        do {
            System.out.println("*** Alojamientos ***");
            System.out.println("1. Consultar por todos los alojamientos");
            System.out.println("2. Consultar por Hoteles ordenados por precio");
            System.out.println("3. Consultar por Campings con restaurante");
            System.out.println("4. Consultar por Residencias con descuento");
            System.out.println("5. Salir.");
            System.out.println("Ingrese una opcion: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    mostrarAlojamientos();
                    break;
                case 2:
                    mostrarHoteles();
                    break;
                case 3:
                    mostrarCampings();
                    break;
                case 4:
                    mostrarResidencias();
                    break;
                case 5:
                    System.out.println("Saliste.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }

        } while (opc != 5);
    }

}
