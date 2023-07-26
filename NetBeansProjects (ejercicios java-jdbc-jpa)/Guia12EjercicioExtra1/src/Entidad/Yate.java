/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Jib
 */
public final class Yate extends Lancha {

    private int cantCamarotes;

    public Yate(int cantCamarotes, int potencia, int matricula, int eslora, int anoFabricacion) {
        super(potencia, matricula, eslora, anoFabricacion);
        this.cantCamarotes = cantCamarotes;

    }

    @Override
    public double calcModulo() {
        return super.calcModulo()+ cantCamarotes; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    

    @Override
    public String toString() {
        return super.toString() + " Potencia: " + potencia + ". Cantidad de camarotes: " + cantCamarotes;
    }

}
