/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia10extras;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class ej4g10ex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        Map<String, Integer> cp = new HashMap<>();

        int opc;

        do {
            System.out.println("*** Codigos Postales ***");
            System.out.println("1. Agregar codigo postal");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Buscar ciudad por codigo");
            System.out.println("4. Eliminar ciudad");
            System.out.println("5. Salir.");
            System.out.println("Ingrese una opcion: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:

                    String resp;

                    do {

                        System.out.println("Ingrese el nombre de la ciudad");
                        String nombre = sc.next();

                        cp.put(nombre, (int) (Math.random() * 9999));

                        System.out.println("Desea ingresar otro codigo postal?");
                        resp = sc.next();

                    } while (resp.equalsIgnoreCase("si"));

                    break;
                case 2:

                    System.out.println("Lista de codigos postales con su ciudad");
                    System.out.println("--------------------------");

                    for (Map.Entry<String, Integer> entry : cp.entrySet()) {
                        String key = entry.getKey();
                        Integer value = entry.getValue();
                        System.out.println("Codigo postal: " + value);
                        System.out.println("Ciudad: " + key);
                        System.out.println("--------------------------");
                    }

                    break;
                case 3:

                    System.out.println("Ingrese un codigo postal");
                    Integer buscar = sc.nextInt();

                    boolean valid = false;

                    for (Map.Entry<String, Integer> entry : cp.entrySet()) {
                        String key = entry.getKey();
                        Integer value = entry.getValue();
                        if (value.equals(buscar)) {
                            System.out.println("El codigo postal pertenece a la ciudad de: " + key);
                            valid = true;
                            break;
                        }

                    }

                    if (!valid) {
                        System.out.println("El codigo no pertenece a ninguna ciudad de la lista");

                    }

                    break;
                case 4:

                    System.out.println("Ingrese una ciudad para borrar de la lista");
                    String borrar = sc.next();

                    if (cp.containsKey(borrar)) {
                        cp.remove(borrar);
                        System.out.println("La ciudad: " + borrar + " se borro de la lista");
                    } else {
                        System.out.println("La ciudad no esta en la lista");
                    }

                    break;
                case 5:

                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        } while (opc != 5);

    }

}
