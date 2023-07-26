/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class Circunferencia {
    
    private double radio;
    Scanner sc = new Scanner(System.in);
    
    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia(){
        System.out.println("Ingrese el radio");
        this.radio = sc.nextInt();
    }
    
    public void area(){
        System.out.println("El area es: " + (Math.pow((Math.PI * radio), 2)));
    }
    
    public void perimetro(){
        System.out.println("El perimetro es: " + (2 * Math.PI * radio));
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
}
