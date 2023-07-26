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
public class Cuota {

    private int numCuota;
    private double montoCuota;
    private boolean pagada;
    private Date fechaVenc;
    private String formaPago;

    public Cuota() {
    }

    public Cuota(int numCuota, double montoCuota, boolean pagada, Date fechaVenc, String formaPago) {
        this.numCuota = numCuota;
        this.montoCuota = montoCuota;
        this.pagada = pagada;
        this.fechaVenc = fechaVenc;
        this.formaPago = formaPago;
    }

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public double getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(double montoCuota) {
        this.montoCuota = montoCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Date getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(Date fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "numCuota=" + numCuota + ", montoCuota=" + montoCuota + ", pagada=" + pagada + ", fechaVenc=" + fechaVenc + ", formaPago=" + formaPago + '}';
    }

}
