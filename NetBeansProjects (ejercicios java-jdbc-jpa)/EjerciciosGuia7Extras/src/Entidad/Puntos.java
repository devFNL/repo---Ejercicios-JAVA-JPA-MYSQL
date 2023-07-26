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
public class Puntos {
    
    public double x1;
    public double y1;
    public double x2;
    public double y2;
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Puntos() {
    }

    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public void crearPuntos(){
        System.out.println("Ingrese la primera coordenada (x1/y1)");
        this.x1 = sc.nextDouble();
        this.y1 = sc.nextDouble();
        System.out.println("Ingrese la segunda coordenada (x2/y2)");
        this.x2 = sc.nextDouble();
        this.y2 = sc.nextDouble();
        
    }
    
    public void calcularDistancia(){
        
        System.out.println("La distancia entre los 2 puntos es: " + (Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2))));
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    
    
}
