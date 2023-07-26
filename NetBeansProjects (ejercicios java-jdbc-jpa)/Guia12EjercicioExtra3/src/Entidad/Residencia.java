/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Jib
 */
public final class Residencia extends Extra {

    private int cantHab;
    private boolean descuento;
    private boolean campoDeportivo;

    public Residencia(int cantHab, boolean descuento, boolean campoDeportivo, boolean privado, double superficie, String nombre, String direccion, String localidad, String gerente) {
        super(privado, superficie, nombre, direccion, localidad, gerente);
        this.cantHab = cantHab;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencia() {
    }

    @Override
    public String toString() {
        return super.toString() + "\n Residencia. Cantidad de habitaciones: " + cantHab + ", Tiene descuento ?: " + descuento + ", Tiene campo deportivo?: " + campoDeportivo; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }



    public int getCantHab() {
        return cantHab;
    }

    public void setCantHab(int cantHab) {
        this.cantHab = cantHab;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }



}
