/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12ejercicio1;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

/**
 *
 * @author Jib
 */
public class Guia12Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Animal perro1 = new Perro("Roco", "Carne", 3, "Pitbull");
        System.out.println("Perro: ");
        perro1.mostrarAlimento();
        Animal gato1 = new Gato("Lara", "Pescado", 2, "Persa");
        System.out.println("Gato: ");
        gato1.mostrarAlimento();
        Animal caballo1 = new Caballo("Grene", "Pasto", 5, "Pinto");
        System.out.println("Caballo: ");
        caballo1.mostrarAlimento();

    }

}
