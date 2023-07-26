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
public class Electrodomestico {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    protected int precio;
    protected String color;
    protected String consumo;
    protected int peso;

    public Electrodomestico() {

    }

    public Electrodomestico(int precio, String color, String consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public void comprobarConsumo(String consumo) {

        String[] letras = {"A", "B", "C", "D", "E", "F"};

        for (int i = 0; i < letras.length; i++) {
            if (consumo.equalsIgnoreCase(letras[i])) {
                this.consumo = consumo;
                break;
            } else {
                this.consumo = "F";
            }
        }

    }

    public void comprobarColor(String color) {

        String[] colores = {"Blanco", "Negro", "Azul", "Rojo", "Gris"};

        for (int i = 0; i < colores.length; i++) {
            if (color.equalsIgnoreCase(colores[i])) {
                this.color = color;
            } else {
                this.color = "Blanco";
            }
        }

    }

    public void crearElectrodomestico() {

        this.precio = 1000;
        System.out.println("Ingrese color");
        String colorAux = sc.next();
        comprobarColor(colorAux);
        System.out.println("Ingrese tipo de consumo (A/B/C/D/E/F)");
        String consumoAux = sc.next().toUpperCase();
        comprobarConsumo(consumoAux);
        System.out.println("Ingrese peso");
        int pesoAux = sc.nextInt();
        this.peso = pesoAux;

    }

    public void precioFinal() {

        switch (this.consumo) {
            case "A":
                this.precio += 1000;
                break;
            case "B":
                this.precio += 800;
                break;
            case "C":
                this.precio += 600;
                break;
            case "D":
                this.precio += 500;
                break;
            case "E":
                this.precio += 300;
                break;
            case "F":
                this.precio += 100;
                break;
            default:
                break;
        }

        if (peso >= 1 && peso <= 19) {
            this.precio += 100;
        } else if (peso >= 20 && peso <= 59) {
            this.precio += 500;
        } else if (peso >= 50 && peso <= 79) {
            this.precio += 800;
        } else {
            this.precio += 1000;
        }

    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
}
