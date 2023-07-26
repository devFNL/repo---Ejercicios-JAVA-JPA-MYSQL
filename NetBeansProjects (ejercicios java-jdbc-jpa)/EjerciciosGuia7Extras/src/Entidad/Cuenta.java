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
public class Cuenta {

    private double saldo = (Math.random() * 10000);
    private String titular;

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void retirar() {
        double retiro;
        System.out.println("Ingrese su nombre");
        this.titular = sc.next();
        System.out.println("Bienvenido " + titular);
        System.out.println("Su saldo actual es: " + saldo);

        do {
            System.out.println("Error. No dispone de esa cantidad para retirar");
            System.out.println("Ingrese monto a retirar");
            retiro = sc.nextDouble();

        } while (retiro > saldo);

        saldo = (saldo - retiro);
        System.out.println("Retiro con exito");
        System.out.println("Su saldo atual es: " + saldo);

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

}
