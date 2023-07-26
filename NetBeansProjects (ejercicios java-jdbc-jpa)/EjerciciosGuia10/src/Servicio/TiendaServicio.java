/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class TiendaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    Map<String, Double> tienda = new HashMap<String, Double>();

    public void agregarProducto(String producto, double precio) {

        tienda.put(producto, precio);
    }

    public void modifPrecio(String producto, double nvoPrecio) {

        if (tienda.containsKey(producto)) {
            tienda.put(producto, nvoPrecio);
            System.out.println("El precio de: " + producto + " se cambio");
        } else {
            System.out.println("El producto: " + producto + "no esta en la tienda");
        }
    }

    public void eliminarProducto(String producto) {

        if (tienda.containsKey(producto)) {
            tienda.remove(producto);
            System.out.println("El producto " + producto + " se elimino");
        } else {
            System.out.println("El producto: " + producto + "no esta en la tienda");
        }
    }

    public void mostrar() {

        System.out.println("Lista de productos de la tienda");
        for (Map.Entry<String, Double> entry : tienda.entrySet()) {
            String producto = entry.getKey();
            double precio = entry.getValue();
            System.out.println("Producto: " + producto + "= " + "$ " + precio);

        }
    }

    public void tienda() {

        int opc;

        do {
            System.out.println("*** Tienda ***");
            System.out.println("1. Agregar un producto.");
            System.out.println("2. Modificar el precio de un producto.");
            System.out.println("3. Eliminar un producto.");
            System.out.println("4. Mostrar la lista de productos.");
            System.out.println("5. Salir.");
            System.out.println("Ingrese una opcion: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    
                    String resp = null;
                    do {                        
                    
                    System.out.println("Ingrese el nombre del producto: ");
                    String producto = sc.next();
                    System.out.println("Ingrese el precio del producto: ");
                    double precio = sc.nextDouble();
                    agregarProducto(producto, precio);
                    
                        System.out.println("Desea ingresar otro producto?");
                        resp = sc.next();
                        
                    } while (resp.equalsIgnoreCase("si"));
                    
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto: ");
                    String prodModif = sc.next();
                    System.out.println("Ingrese el nuevo precio del producto: ");
                    double nuevoPrecio = sc.nextDouble();
                    modifPrecio(prodModif, nuevoPrecio);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del producto: ");
                    String prodElim = sc.next();
                    eliminarProducto(prodElim);
                    break;
                case 4:
                    mostrar();
                    break;
                case 5:
                    System.out.println("Buenas tardes");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        } while (opc != 5);
    }
}
