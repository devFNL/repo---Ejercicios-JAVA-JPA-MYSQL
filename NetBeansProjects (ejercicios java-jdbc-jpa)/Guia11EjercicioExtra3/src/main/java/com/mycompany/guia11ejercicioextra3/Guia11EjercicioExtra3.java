/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.guia11ejercicioextra3;

import Entidad.Poliza;
import Servicio.SeguroServicio;
import java.util.Arrays;

/**
 *
 * @author Jib
 */
public class Guia11EjercicioExtra3 {

    public static void main(String[] args) {

        SeguroServicio serv = new SeguroServicio();

        Poliza pol = serv.crearPoliza();

        System.out.println("Informacion de la poliza: ");
        System.out.println(pol);
        System.out.println("Cuotas: ");
        System.out.println(Arrays.toString(pol.getCuotas()));

    }
}
