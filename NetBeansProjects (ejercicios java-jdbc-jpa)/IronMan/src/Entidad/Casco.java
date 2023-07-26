/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Jib
 */
public class Casco {

    private String consola;
    private String sintetizador;
    private float consumoCasco;
    private boolean cascoRoto;

    public Casco() {
    }

    public Casco(String consola, String sintetizador, float consumoCasco, boolean cascoRoto) {
        this.consola = consola;
        this.sintetizador = sintetizador;
        this.consumoCasco = consumoCasco;
        this.cascoRoto = cascoRoto;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public String getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(String sintetizador) {
        this.sintetizador = sintetizador;
    }

    public float getConsumoCasco() {
        return consumoCasco;
    }

    public void setConsumoCasco(float consumoCasco) {
        this.consumoCasco = consumoCasco;
    }

    public boolean isCascoRoto() {
        return cascoRoto;
    }

    public void setCascoRoto(boolean cascoRoto) {
        this.cascoRoto = cascoRoto;
    }

    @Override
    public String toString() {
        return "Casco{" + "consola=" + consola + ", sintetizador=" + sintetizador + ", consumoCasco=" + consumoCasco + ", cascoRoto=" + cascoRoto + '}';
    }

}
