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
public class Rectangulo {

    private double base;
    private double altura;
    Scanner sc = new Scanner(System.in);

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void crearRectangulo() {
        System.out.println("Ingrese base del rectangulo");
        this.base = sc.nextDouble();
        System.out.println("Ingrese altura del rectangulo");
        this.altura = sc.nextDouble();

    }

    public void base() {
        System.out.println("La base es: " + (base * altura));
    }

    public void altura() {
        System.out.println("La altura es: " + ((base + altura) * 2));
    }

    public void dibujo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
