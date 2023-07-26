/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Jib
 */
public class Enemigo {

    private double distancia;
    private int resistencia;
    private boolean hostil;

    public Enemigo() {
    }

    public Enemigo(double distancia, int resistencia, boolean hostil) {
        this.distancia = distancia;
        this.resistencia = resistencia;
        this.hostil = hostil;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public boolean isHostil() {
        return hostil;
    }

    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }

    @Override
    public String toString() {
        return "Enemigo{" + "distancia=" + distancia + ", resistencia=" + resistencia + ", hostil=" + hostil + '}';
    }

}
