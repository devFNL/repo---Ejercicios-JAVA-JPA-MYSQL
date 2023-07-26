/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Jib
 */
public class Guante {

    private float consumoGuante;
    private boolean rotoGuante;

    public Guante() {
    }

    public Guante(float consumoGuante, boolean rotoGuante) {
        this.consumoGuante = consumoGuante;
        this.rotoGuante = rotoGuante;
    }

    public float getConsumoGuante() {
        return consumoGuante;
    }

    public void setConsumoGuante(float consumoGuante) {
        this.consumoGuante = consumoGuante;
    }

    public boolean isRotoGuante() {
        return rotoGuante;
    }

    public void setRotoGuante(boolean rotoGuante) {
        this.rotoGuante = rotoGuante;
    }

    @Override
    public String toString() {
        return "Guante{" + "consumoGuante=" + consumoGuante + ", rotoGuante=" + rotoGuante + '}';
    }

}
