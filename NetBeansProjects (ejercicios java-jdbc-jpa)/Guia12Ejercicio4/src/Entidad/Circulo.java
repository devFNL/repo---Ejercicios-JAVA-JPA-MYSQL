/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Interfaces.calculosFormas;

/**
 *
 * @author Jib
 */
public class Circulo implements calculosFormas {

    private int radio;
    private int diametro;

    public Circulo() {
    }

    public Circulo(int radio) {
        this.radio = radio;
        this.diametro = radio * 2;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + '}';
    }

    @Override
    public double calcArea() {
        return pi * (Math.pow(radio, 2));
    }

    @Override
    public double calcPerim() {
        return pi * diametro;
    }

}
