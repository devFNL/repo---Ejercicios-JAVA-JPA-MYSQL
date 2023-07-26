/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia9;

import Entidad.ParDeNumeros;
import Servicio.ParDeNumerosServicio;

/**
 *
 * @author Jib
 */
public class ej2g9 {

    public static void main(String[] args) {

        ParDeNumerosServicio serv = new ParDeNumerosServicio();
        ParDeNumeros uno = new ParDeNumeros();

        serv.mostrarValores(uno);
        serv.devolverMayor(uno);
        serv.mostrarMayor(uno);
        serv.calcularPotencia(uno);
        serv.calcularRaiz(uno);
    }
}
