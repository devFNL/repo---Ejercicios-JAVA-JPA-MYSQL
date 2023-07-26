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
public final class Lavadora extends Electrodomestico {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int precio, String color, String consumo, int peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public void crearLavadora() {
        crearElectrodomestico();
        System.out.println("Ingrese carga");
        this.carga = sc.nextInt();

    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            this.precio += 500;
        }

    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString() + "Lavadora. Carga: " +carga; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
}
