/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.ParDeNumeros;

/**
 *
 * @author Jib
 */
public class ParDeNumerosServicio {
    
    public void mostrarValores(ParDeNumeros par){
        
        System.out.println("Numero 1: " + par.getNum1());
        System.out.println("Numero 2: " + par.getNum2());
    }
    
    public double devolverMayor(ParDeNumeros par){
        
        double mayor = Math.max(par.getNum1(), par.getNum2());
        
        return mayor;
    }
    
    public void mostrarMayor(ParDeNumeros par){
        
        System.out.println("El numero mayor es: " + devolverMayor(par));
        
    }
    
    public void calcularPotencia(ParDeNumeros par){
        
        double mayor = Math.round(devolverMayor(par));
        double menor = Math.round(Math.min(par.getNum1(), par.getNum2()));
        
        double potencia = Math.pow(mayor, menor);
        
        System.out.println(mayor + " " + menor + " La potencia es: " + potencia);
        
    }
    
    public void calcularRaiz(ParDeNumeros par){
        
        double menor = Math.min(par.getNum1(), par.getNum2());
                
        double absoluto = Math.abs(menor);
        double raiz = Math.sqrt(absoluto);
        
        System.out.println("La raiz es: " + raiz);
        
    }
    
}
