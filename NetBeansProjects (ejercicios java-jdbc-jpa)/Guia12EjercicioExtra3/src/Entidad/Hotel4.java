/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Jib
 */
public class Hotel4 extends Hotel {

    protected String gimnasio;
    protected String nombreResto;
    protected int capacidadResto;

    public Hotel4(String gimnasio, String nombreResto, int capacidadResto, int cantHab, int cantCamas, int cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(cantHab, cantCamas, cantPisos, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreResto = nombreResto;
        this.capacidadResto = capacidadResto;
    }

    public Hotel4() {
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody

        if (this.capacidadResto < 30) {
            this.precioHabitaciones += 10.d;
        } else if (this.capacidadResto >= 30 && this.capacidadResto <= 50) {
            this.precioHabitaciones += 30;
        } else {
            this.precioHabitaciones += 50;
        }

        switch (gimnasio) {
            case "A":
                this.precioHabitaciones += 50;
                break;
            case "B":
                this.precioHabitaciones += 30;
                break;

            default:
                throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return super.toString() + ".\n Gimnasio : " + gimnasio + ", Nombre resto: " + nombreResto + ", Capacidad resto: " + capacidadResto;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreResto() {
        return nombreResto;
    }

    public void setNombreResto(String nombreResto) {
        this.nombreResto = nombreResto;
    }

    public int getCapacidadResto() {
        return capacidadResto;
    }

    public void setCapacidadResto(int capacidadResto) {
        this.capacidadResto = capacidadResto;
    }

}
