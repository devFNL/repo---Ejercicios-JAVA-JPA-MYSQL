/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia10extras;

import Entidad.Cantante;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class ej2g10ex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        List<Cantante> listaCant = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el nombre del cantante");
            String nombre = sc.next();
            System.out.println("Ingrese el nombre del disco");
            String disco = sc.next();

            Cantante cantante = new Cantante(nombre, disco);
            listaCant.add(cantante);
        }

        int opc;

        do {
            System.out.println("*** Cantantes Famosos ***");
            System.out.println("1. Agregar otro cantante.");
            System.out.println("2. Mostrar todos los cantantes.");
            System.out.println("3. Borrar un cantante.");
            System.out.println("4. Salir.");
            System.out.println("Ingrese una opcion: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese el nombre del cantante: ");
                    String nombre = sc.next();
                    System.out.println("Ingrese el nombre del disco: ");
                    String disco = sc.next();
                    Cantante aux = new Cantante(nombre, disco);
                    listaCant.add(aux);
                    break;
                case 2:
                    System.out.println(listaCant.toString());
                    break;
                case 3:

                    System.out.println("Ingrese el nombre del cantante a borrar");
                    String borrar = sc.next();

                    Iterator<Cantante> it = listaCant.iterator();
                    boolean valid = false;
                    while (it.hasNext()) {
                        if (it.next().getNombre().equalsIgnoreCase(borrar)) {
                            it.remove();
                            valid = true;
                            break;
                        }

                    }
                    if (valid) {
                        System.out.println("El cantante : " + borrar + " fue borrado de la lista");
                    } else {
                        System.out.println("El cantante no se encuentra en la lista");
                    }
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (opc != 4);

    }

}
