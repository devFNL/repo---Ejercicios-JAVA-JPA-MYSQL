/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia9;

import Entidad.Cadena;
import Servicio.CadenaServicio;

/**
 *
 * @author Jib
 */
public class ej1g9 {

    public static void main(String[] args) {

        CadenaServicio serv = new CadenaServicio();
        Cadena primera = serv.crearFrase();

        serv.mostrarVocales(primera);
        serv.invertirFrase(primera);
        serv.vecesRepetida(primera);
        serv.unirFrases(primera);
        serv.reemplazar(primera);
        serv.contiene(primera);


        
    }
}
