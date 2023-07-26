/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

/**
 *
 * @author Jib
 */
public class AutorServicio {

    private final AutorDAO DAO;

    public AutorServicio() {
        this.DAO = new AutorDAO();
    }

    public Autor crearAutor(String nombre) {
        Autor autor = new Autor();
        try {
            autor.setNombre(nombre);
            DAO.guardar(autor);
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Autor> listarAutores() {
        try {
            return DAO.listarAutores();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Autor buscarAutorPorNombre(String nombre) {
        try {
            return DAO.buscarAutorPorNombre(nombre);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void darDeBajaAutor(String nombre) {

        Autor autor = buscarAutorPorNombre(nombre);
        autor.setAlta(false);
        DAO.editar(autor);
    }

    public void darDeAltaAutor(String nombre) {

        Autor autor = buscarAutorPorNombre(nombre);
        autor.setAlta(true);
        DAO.editar(autor);
    }

}
