/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12;

import Entidad.Animal;
import Entidad.Gato;
import Entidad.Perro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jib
 */
public class Guia12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Animal> animales = new ArrayList();
        
        Animal a = new Animal();
        Animal b = new Perro("Roco", "Pitbull", "Perro", 3);
        Animal c = new Gato("Maven", "Persa", "Gato", 2);
        
        animales.add(a);
        animales.add(b);
        animales.add(c);
        
        
        for (Animal aux : animales) {
            aux.hacerRuido();
        }
        
        
        System.out.println("Pasear: ");
        b.pasear(4);
        System.out.println("Comer: ");
        b.comer(5);
        System.out.println("Edad: ");
        b.mostrarEdad();
        
        
    }
    
}
