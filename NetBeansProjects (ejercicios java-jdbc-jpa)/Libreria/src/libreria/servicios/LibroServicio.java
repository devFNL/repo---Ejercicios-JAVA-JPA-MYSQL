/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

/**
 *
 * @author Jib
 */
public class LibroServicio {

    private final LibroDAO DAO;

    public LibroServicio() {
        this.DAO = new LibroDAO();
    }

    public Libro crearLibro(Long ISBN, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Autor autor, Editorial editorial) {
        Libro libro = new Libro();
        try {
            libro.setISBN(ISBN);
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            DAO.guardar(libro);
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Libro buscarLibroPorISBN(Long ISBN) {
        try {
            return DAO.buscarLibroPorISBN(ISBN);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }

    }

    public Libro buscarLibroPorTitulo(String titulo) {
        try {
            return DAO.buscarLibroPorTitulo(titulo);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public List<Libro> buscarLibrosPorAutor(String autor) {
        try {
            return DAO.listarLibrosPorNombreAutor(autor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public List<Libro> buscarLibrosPorEditorial(String editorial) {
        try {
            return DAO.listarLibrosPorNombreEditorial(editorial);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public void darDeBajaLibro(String titulo) {

        Libro libro = buscarLibroPorTitulo(titulo);
        libro.setAlta(false);
        DAO.editar(libro);
    }

    public void darDeAltaLibro(String titulo) {

        Libro libro = buscarLibroPorTitulo(titulo);
        libro.setAlta(true);
        DAO.editar(libro);
    }
}
