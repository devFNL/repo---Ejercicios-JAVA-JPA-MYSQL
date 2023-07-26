/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

/**
 *
 * @author Jib
 */
public class EditorialServicio {

    private final EditorialDAO DAO;

    public EditorialServicio() {
        this.DAO = new EditorialDAO();
    }

    public Editorial crearEditorial(String nombre) {

        try {
            Editorial editorial = new Editorial();
            editorial.setNombre(nombre);
            DAO.guardar(editorial);
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Editorial buscarEditorialPorNombre(String nombre) {
        try {
            return DAO.buscarEditorialPorNombre(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void darDeBajaEditorial(String nombre) {

        Editorial editorial = buscarEditorialPorNombre(nombre);
        editorial.setAlta(false);
        DAO.editar(editorial);
    }

    public void darDeAltaEditorial(String nombre) {

        Editorial editorial = buscarEditorialPorNombre(nombre);
        editorial.setAlta(true);
        DAO.editar(editorial);
    }

}
