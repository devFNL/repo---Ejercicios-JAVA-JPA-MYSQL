/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia8extras;

import Entidad.NIF;
import Servicio.NIFServicio;

/**
 *
 * @author Jib
 */
public class ej2g8ex {

    public static void main(String[] args) {

        NIFServicio serv = new NIFServicio();
        NIF digito = serv.crearNif();
        serv.mostrar(digito);

    }

}
