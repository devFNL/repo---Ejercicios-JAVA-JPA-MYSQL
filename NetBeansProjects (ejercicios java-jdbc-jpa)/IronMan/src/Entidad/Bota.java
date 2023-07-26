/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Jib
 */
public class Bota {

    private float consumoBota;
    private boolean rotoBota;

    public Bota() {
    }

    public Bota(float consumoBota, boolean rotoBota) {
        this.consumoBota = consumoBota;
        this.rotoBota = rotoBota;
    }

    public float getConsumoBota() {
        return consumoBota;
    }

    public void setConsumoBota(float consumoBota) {
        this.consumoBota = consumoBota;
    }

    public boolean isRotoBota() {
        return rotoBota;
    }

    public void setRotoBota(boolean rotoBota) {
        this.rotoBota = rotoBota;
    }

    @Override
    public String toString() {
        return "Bota{" + "consumoBota=" + consumoBota + ", rotoBota=" + rotoBota + '}';
    }

}
