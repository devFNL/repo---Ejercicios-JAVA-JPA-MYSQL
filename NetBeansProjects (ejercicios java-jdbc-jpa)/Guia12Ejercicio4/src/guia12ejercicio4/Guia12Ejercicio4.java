/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12ejercicio4;

import Entidad.Circulo;
import Entidad.Rectangulo;

/**
 *
 * @author Jib
 */
public class Guia12Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Circulo cir = new Circulo(30);
        Rectangulo rec = new Rectangulo(5, 10);
        
        System.out.println("* Datos del circulo *");
        System.out.println(cir.toString());
        System.out.println("Area circulo: " + cir.calcArea());
        System.out.println("Perimetro circulo: " + cir.calcPerim());
        
        System.out.println("* Datos del rectangulo *");
        System.out.println(rec.toString());
        System.out.println("Area recangulo: " + rec.calcArea());
        System.out.println("Perimetro rectangulo: " + rec.calcPerim());

    }
    
}
