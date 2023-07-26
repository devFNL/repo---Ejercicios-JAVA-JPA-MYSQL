/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Libro;

/**
 *
 * @author Jib
 */
public class LibroDAO extends DAO<Libro> {

    @Override
    public void guardar(Libro libro) {
        super.guardar(libro); //To change body of generated methods, choose Tools | Templates.
    }

    public void eliminar(Long ISBN) throws Exception {
        Libro libro = buscarLibroPorISBN(ISBN);
        super.eliminar(libro);
    }

    @Override
    public void editar(Libro libro) {
        super.editar(libro); //To change body of generated methods, choose Tools | Templates.
    }

    public Libro buscarLibroPorISBN(Long ISBN) {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.ISBN = :isbn AND l.alta = 1")
                .setParameter("isbn", ISBN)
                .getSingleResult();
        desconectar();
        return libro;
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo = :titulo AND l.alta = 1")
                .setParameter("titulo", titulo)
                .getSingleResult();
        desconectar();
        return libro;
    }

    public List<Libro> listarLibros() {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.alta = 1")
                .getResultList();
        desconectar();
        return libros;
    }

    public Libro buscarLibroPorNombreAutor(String autor) {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l JOIN l.autor a WHERE a.nombre = :nombre AND l.alta = 1")
                .setParameter("nombre", autor)
                .getSingleResult();
        desconectar();
        return libro;
    }

    public List<Libro> listarLibrosPorNombreAutor(String autor) {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN l.autor a WHERE a.nombre = :nombre AND l.alta = 1")
                .setParameter("nombre", autor)
                .getResultList();
        desconectar();
        return libros;
    }

    public Libro buscarLibroPorNombreEditorial(String editorial) {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l JOIN l.editorial e WHERE e.nombre = :nombreEditorial AND e.alta = 1")
                .setParameter("nombreEditorial", editorial)
                .getSingleResult();
        desconectar();
        return libro;
    }

    public List<Libro> listarLibrosPorNombreEditorial(String editorial) {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN l.editorial e WHERE e.nombre = :nombreEditorial AND e.alta = 1")
                .setParameter("nombreEditorial", editorial)
                .getResultList();
        desconectar();
        return libros;
    }

}
