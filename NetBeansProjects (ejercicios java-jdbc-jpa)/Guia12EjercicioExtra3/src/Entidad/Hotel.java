/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Jib
 */
public class Hotel extends Alojamiento {

    protected int cantHabitaciones;
    protected int cantCamas;
    protected int cantPisos;
    protected Double precioHabitaciones;

    public Hotel(int cantHab, int cantCamas, int cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHab;
        this.cantCamas = cantCamas;
        this.cantPisos = cantPisos;
    }

    public Hotel() {
    }

    public void precioFinal() {

        this.precioHabitaciones = 50.d + cantCamas;

    }

    @Override
    public String toString() {
        return super.toString() + ".\n Tipo: Hotel. " + " Cantiadad de Habitaciones: " + cantHabitaciones + ", Cantidad de camas : " + cantCamas + ", Cantidad de pisos: " + cantPisos + ", Precio de habitacion: $" + precioHabitaciones;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(Double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

}
