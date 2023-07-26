/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Jib
 */
public final class Hotel5 extends Hotel4 {

    private int cantSalones;
    private int cantSuites;
    private int cantLimo;

    public Hotel5(int cantSalones, int cantSuites, int cantLimo, String gimnasio, String nombreResto, int capacidadResto, int cantHab, int cantCamas, int cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreResto, capacidadResto, cantHab, cantCamas, cantPisos, nombre, direccion, localidad, gerente);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimo = cantLimo;
    }

    public Hotel5() {
    }

    @Override
    public void precioFinal() {
        super.precioFinal();

        this.precioHabitaciones += 15.d * this.cantLimo;

    }

    @Override
    public String toString() {
        return super.toString() + ".\n Cantidad de salones: " + cantSalones + ", Cantidad de suites: " + cantSuites + ", Cantidad de limo: " + cantLimo;
    }

    public int getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(int cantSalones) {
        this.cantSalones = cantSalones;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimo() {
        return cantLimo;
    }

    public void setCantLimo(int cantLimo) {
        this.cantLimo = cantLimo;
    }

}
