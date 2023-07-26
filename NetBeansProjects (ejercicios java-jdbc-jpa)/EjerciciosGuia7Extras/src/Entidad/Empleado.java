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
public class Empleado {
    
    public String nombre;
    public int edad;
    public double salario;
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    public void calcularAumento(){
        System.out.println("Ingrese su nombre: ");
        nombre = sc.next();
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        System.out.println("Ingrese su salario");
        salario = sc.nextDouble();
        
        double aumento;
        
        if (edad > 30) {
            System.out.println("Le corresponde un 10% de aumento");
            aumento = (salario * 1.10);
        } else {
            System.out.println("Le corresponde un 5% de aumento");
            aumento = (salario * 1.05);
        }
        
        System.out.println("Empleado: " + nombre);
        System.out.println("Su nuevo salario es: " + aumento);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
