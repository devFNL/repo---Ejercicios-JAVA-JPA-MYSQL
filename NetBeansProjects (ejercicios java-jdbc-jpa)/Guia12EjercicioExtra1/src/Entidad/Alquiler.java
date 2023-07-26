/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author Jib
 */
public class Alquiler {

    private String nombre;
    private int dni;
    private Date fechaIni;
    private Date fechaFin;
    private int posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, int dni, Date fechaIni, Date fechaFin, int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    

    public double calcularPrecio() {
        
        int difDias = (int) ((int) fechaFin.getTime() - fechaIni.getTime());
        int dias = difDias / (1000 * 60 * 60 * 24);
        System.out.println("Cantidad de Dias: " + dias);
        double mod = barco.calcModulo();
        return dias * mod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dni=" + dni + ", fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }

}
