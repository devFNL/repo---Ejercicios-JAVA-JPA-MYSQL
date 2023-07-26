/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Jib
 */
public final class Televisor extends Electrodomestico {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    private int resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizadorTDT, int precio, String color, String consumo, int peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {
        crearElectrodomestico();
        System.out.println("Ingrese resolucion (en pulgadas)");
        this.resolucion = sc.nextInt();
        System.out.println("Posee sintonizador TDT? (true/false)");
        this.sintonizadorTDT = sc.nextBoolean();

    }

    @Override
    public void precioFinal() {
        super.precioFinal();

        if (resolucion > 40) {
            int aumento = (int) (precio * 0.30);
            this.precio += aumento;
        }

        if (sintonizadorTDT) {
            this.precio += 500;
        }

    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        System.out.println("Televisor{" + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}');
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
