/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class CuentaBancariaServicio {
    
    Scanner sc = new Scanner(System.in);
    
    public CuentaBancaria crearCuenta(){
        
        System.out.println("Ingrese su numero de DNI");
        int dni = sc.nextInt();
        System.out.println("Ingrese su saldo");
        double saldo = sc.nextDouble();
        System.out.println("Su numero de cliente se generara automaticamente");
        int num = (int) (Math.random()*1000);
        
        return new CuentaBancaria( num,  dni,  saldo);
    }
    
    public double ingresar(CuentaBancaria cuenta){
        double actual = cuenta.getSaldoActual();
        System.out.println("Ingrese monto a depositar");
        double depo = sc.nextDouble();
        cuenta.setSaldoActual(actual + depo);
        System.out.println("Deposito realizado con exito. Su saldo actual es: " + cuenta.getSaldoActual());
        return cuenta.getSaldoActual();
            
    }
    
    public double retirar(CuentaBancaria cuenta){
        double actual = cuenta.getSaldoActual();
        System.out.println("Ingrese monto a retirar");
        double reti = sc.nextDouble();
        
        
        if (reti > actual) {        
            cuenta.setSaldoActual(0);
            System.out.println("Retiraste todo lo posible. Su saldo actual es: " + cuenta.getSaldoActual());
        } else {
            
            cuenta.setSaldoActual(actual - reti);
            System.out.println("Retiro con exito. Su saldo actual es: " + cuenta.getSaldoActual());
        }
        
        return cuenta.getSaldoActual();
    }
    
    public double extraccionRapida(CuentaBancaria cuenta){
        double actual = cuenta.getSaldoActual();
        System.out.println("Ingrese el monto a retirar");
        double retiRap = sc.nextDouble();
        
        if (retiRap > (actual * 0.20)) {
            System.out.println("Error. No puede retirar mas del 20% de su saldo actual");    
        } else {
            cuenta.setSaldoActual(actual - retiRap);
            System.out.println("Retiro exitoso. Su saldo actual es: " + cuenta.getSaldoActual());
        }
        
        return cuenta.getSaldoActual();
    }
    
    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("Su saldo actual es: " + cuenta.getSaldoActual());
    }
    
    public void consultarDatos (CuentaBancaria cuenta) {
        System.out.println("Su numero de cuenta es: " + cuenta.getNumeroCuenta());
        System.out.println("Su numero de DNI es: " + cuenta.getDniCliente());
    }
}
