/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Jib
 */
public class PaisServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    private Set<Pais> conjuntoPaises = new TreeSet();

    
    public Pais crearPais() {

        System.out.println("Ingrese pais");
        String nombre = sc.next();

        return new Pais(nombre);

    }

    public void agregarPais() {
        conjuntoPaises.add(crearPais());

    }
    
//    public void agregarPaisLista(){
//        String resp;
//
//        do {
//
//            conjuntoPaises.add(crearPais());
//            System.out.println("Desea ingresar otro pais?");
//            resp = sc.next();
//
//        } while (resp.equalsIgnoreCase("si"));
//    }

    public void mostrarPaises() {

        for (Pais aux : conjuntoPaises) {
            System.out.println(aux);
        }
    }

    public void eliminarPais() {

        boolean elim = false;

        Iterator<Pais> it = conjuntoPaises.iterator();

        System.out.println("Ingrese pais para buscar y eliminar");
        String buscar = sc.next();

        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(buscar)) {
                it.remove();
                elim = true;
                break;
            }

        }

        if (elim) {
            System.out.println("Se elimino el pais " + buscar);
            System.out.println("Lista de paises actualizada: ");
            mostrarPaises();
        } else {
            System.out.println("No se encontro el pais en el conjunto");
        }

    }

}
