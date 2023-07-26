/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Jib
 */
public final class Velero extends Barco {

    private int numMastil;

    public Velero(int numMastil, int matricula, int eslora, int anoFabricacion) {
        super(matricula, eslora, anoFabricacion);
        this.numMastil = numMastil;
    }

    @Override
    public double calcModulo() {
        return super.calcModulo() + numMastil; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return super.toString() + " Numero de mastiles: " + numMastil;
    }

}
