/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Jib
 */
public class Lancha extends Barco {

    protected int potencia;

    public Lancha(int potencia, int matricula, int eslora, int anoFabricacion) {
        super(matricula, eslora, anoFabricacion);
        this.potencia = potencia;
    }

    @Override
    public double calcModulo() {
        return super.calcModulo() + potencia; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return super.toString() + " Potencia: " + potencia; 
    }

}
