/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Jib
 */
public final class Camping extends Extra {

    private int cantMaxCarpas;
    private int cantBanos;
    private boolean resto;

    public Camping(int cantMaxCarpas, int cantBanos, boolean resto, boolean privado, double superficie, String nombre, String direccion, String localidad, String gerente) {
        super(privado, superficie, nombre, direccion, localidad, gerente);
        this.cantMaxCarpas = cantMaxCarpas;
        this.cantBanos = cantBanos;
        this.resto = resto;
    }

    public Camping() {
    }

    @Override
    public String toString() {
        return super.toString() + "\n Camping. Cantidad maxima de carpas: " + cantMaxCarpas + ", Cantidad de baños: " + cantBanos + ", Tiene resto ?: " + resto;
    }

    public int getCantMaxCarpas() {
        return cantMaxCarpas;
    }

    public void setCantMaxCarpas(int cantMaxCarpas) {
        this.cantMaxCarpas = cantMaxCarpas;
    }

    public int getCantBanos() {
        return cantBanos;
    }

    public void setCantBanos(int cantBanos) {
        this.cantBanos = cantBanos;
    }

    public boolean isResto() {
        return resto;
    }

    public void setResto(boolean resto) {
        this.resto = resto;
    }

    

}
