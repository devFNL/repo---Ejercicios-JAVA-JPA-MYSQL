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
public class Poliza {

    private int numPoliza;
    private Date fechaIni;
    private Date fechaFin;
    private int cantCuotas;
    private String formaPago;
    private double montoAsegurado;
    private boolean granizo;
    private double montoGranizo;
    private String tipoCobertura;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Cuota[] cuotas;

    public Poliza() {
    }

    public Poliza(int numPoliza, Date fechaIni, Date fechaFin, int cantCuotas, String formaPago, double montoAsegurado, boolean granizo, double montoGranizo, String tipoCobertura, Cliente cliente, Vehiculo vehiculo, Cuota[] cuotas) {
        this.numPoliza = numPoliza;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.cantCuotas = cantCuotas;
        this.formaPago = formaPago;
        this.montoAsegurado = montoAsegurado;
        this.granizo = granizo;
        this.montoGranizo = montoGranizo;
        this.tipoCobertura = tipoCobertura;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.cuotas = cuotas;
    }

    public int getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
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

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public double getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(double montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cuota[] getCuotas() {
        return cuotas;
    }

    public void setCuotas(Cuota[] cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public String toString() {
        return "Poliza{" + "numPoliza=" + numPoliza + ", fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + ", cantCuotas=" + cantCuotas + ", formaPago=" + formaPago + ", montoAsegurado=" + montoAsegurado + ", granizo=" + granizo + ", montoGranizo=" + montoGranizo + ", tipoCobertura=" + tipoCobertura + ", cliente=" + cliente + ", vehiculo=" + vehiculo + '}';
    }

}
