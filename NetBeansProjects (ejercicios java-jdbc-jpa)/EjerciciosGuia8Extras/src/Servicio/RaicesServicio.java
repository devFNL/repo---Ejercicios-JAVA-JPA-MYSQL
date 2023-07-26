/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;

/**
 *
 * @author Jib
 */
public class RaicesServicio {

    public double obtDiscriminante(Raices raiz) {

        return (Math.pow(raiz.getB(), 2) - 4 * raiz.getA() * raiz.getC());
    }

    public boolean tieneRaices(Raices raiz) {

        boolean dosRai = obtDiscriminante(raiz) > 0;

        return dosRai;
    }

    public boolean tieneRaiz(Raices raiz) {

        boolean unaRai = obtDiscriminante(raiz) == 0;

        return unaRai;

    }

    public void obtRaices(Raices raiz) {

        if (tieneRaices(raiz)) {
            System.out.println("Solucion 1: " + ((-raiz.getB() + Math.sqrt(obtDiscriminante(raiz))) / (2 * raiz.getA())));
            System.out.println("Solucion 2: " + ((-raiz.getB() - Math.sqrt(obtDiscriminante(raiz))) / (2 * raiz.getA())));
        } else {
            System.out.println("No tiene raices reales");
        }
    }

    public void obtRaiz(Raices raiz) {

        if (tieneRaiz(raiz)) {
            System.out.println("Solucion Unica: " + ((-raiz.getB()) / (2 * raiz.getA())));
        } else {
            System.out.println("No tiene raices reales");
        }
    }

    public void calcular(Raices raiz) {

        if (tieneRaices(raiz)) {
            obtRaices(raiz);
        } else if (tieneRaiz(raiz)) {
            obtRaiz(raiz);
        } else {
            System.out.println("No tiene raices reales");
        }
    }

}
