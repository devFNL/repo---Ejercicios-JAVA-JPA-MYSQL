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
public class Operacion {

    private double num1;
    private double num2;
    Scanner sc = new Scanner(System.in);

    public Operacion() {
    }

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void crearOperacion() {
        System.out.println("Ingrese dos numeros");
        this.num1 = sc.nextDouble();
        this.num2 = sc.nextDouble();
    }

    public double sumar() {
        return (num1 + num2);
    }

    public double restar() {
        return (num1 - num2);
    }

    public double multiplicar() {
        return (num1 * num2);
    }

    public double dividir() {
        double divi;
        if (num2 == 0) {
            System.out.println("Error");
            divi = 0;
        } else {
            divi = (num1 / num2);
        }
        return divi;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}
