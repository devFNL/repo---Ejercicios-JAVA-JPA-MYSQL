/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia9;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author Jib
 */
public class ej5g9 {

    public static void main(String[] args) {

        PersonaServicio serv = new PersonaServicio();
        Persona uno = serv.crearPersona();

        serv.menorQue(uno, serv.calcularEdad(uno));
        serv.mostrarPersona(uno);

    }

}
