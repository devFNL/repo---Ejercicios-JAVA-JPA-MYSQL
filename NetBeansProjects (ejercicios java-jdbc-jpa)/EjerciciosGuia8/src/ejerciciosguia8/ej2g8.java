/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia8;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class ej2g8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        CafeteraServicio serv = new CafeteraServicio();
        Cafetera cafe = new Cafetera();

        do {
            System.out.println("*** Nespresso ***");
            System.out.println("Ingrese una opcion");
            System.out.println("1. Llenar Cafetera");
            System.out.println("2. Servir Taza");
            System.out.println("3. Vaciar Cafetera");
            System.out.println("4. Agregar Cafe");
            System.out.println("5. Status");
            System.out.println("6. Salir");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    serv.llenarCafetera(cafe);
                    break;

                case 2:
                    serv.servirTaza(cafe);
                    break;

                case 3:
                    serv.vaciarCafetera(cafe);
                    break;

                case 4:
                    serv.agregarCafe(cafe);
                    break;

                case 5:
                    serv.mostrarCafetera(cafe);
                    break;

                case 6:
                    System.out.println("Gracias");
                    break;
                default:
                    throw new AssertionError();

            }

        } while (opc != 6);

    }

}
