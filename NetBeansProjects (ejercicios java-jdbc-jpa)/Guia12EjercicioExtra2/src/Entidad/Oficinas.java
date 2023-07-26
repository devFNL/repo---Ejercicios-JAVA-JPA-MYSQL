/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Jib
 */
public final class Oficinas extends Edificio {

    private int cantOficinas;
    private int cantPersonasPorOficina;
    private int cantPisos;

    public Oficinas() {
    }

    public Oficinas(int cantOficinas, int cantPersonasPorOficina, int cantPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.cantOficinas = cantOficinas;
        this.cantPersonasPorOficina = cantPersonasPorOficina;
        this.cantPisos = cantPisos;
    }

    public void cantPersonas() {

        System.out.println("En un piso entran: " + cantPersonasPorOficina + " personas");
        System.out.println("En todo el edificio entran: " + (cantPersonasPorOficina * cantPisos) + " personas");

    }

    public int getCantOficinas() {
        return cantOficinas;
    }

    public void setCantOficinas(int cantOficinas) {
        this.cantOficinas = cantOficinas;
    }

    public int getCantPersonasPorOficina() {
        return cantPersonasPorOficina;
    }

    public void setCantPersonasPorOficina(int cantPersonasPorOficina) {
        this.cantPersonasPorOficina = cantPersonasPorOficina;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Oficinas{" + "cantOficinas=" + cantOficinas + ", cantPersonasPorOficina=" + cantPersonasPorOficina + ", cantPisos=" + cantPisos + '}';
    }

    @Override
    public double calcSuperficie(double ancho, double largo) {

        return ancho * largo;
    }

    @Override
    public double calcVolumen(double ancho, double largo, double alto) {

        return ancho * largo * alto;
    }

}
