/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Prestamo;

/**
 *
 * @author Jib
 */
public class PrestamoDAO extends DAO<Prestamo> {

    @Override
    public void eliminar(Prestamo objeto) {
        super.eliminar(objeto); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Prestamo objeto) {
        super.editar(objeto); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar(Prestamo objeto) {
        super.guardar(objeto); //To change body of generated methods, choose Tools | Templates.
    }

    public Prestamo buscarPrestamoPorISBN(Long ISBN) {
        conectar();
        Prestamo prestamo = (Prestamo) em.createQuery("SELECT p FROM Prestamo p WHERE p.libro.ISBN = :ISBN")
                .setParameter("ISBN", ISBN)
                .getSingleResult();
        desconectar();
        return prestamo;
    }

    public Prestamo buscarPrestamoPorTitulo(String titulo) {
        conectar();
        Prestamo prestamo = (Prestamo) em.createQuery("SELECT p FROM Prestamo p WHERE p.libro.titulo = :titulo")
                .setParameter("titulo", titulo)
                .getSingleResult();
        desconectar();
        return prestamo;
    }

    public List<Prestamo> listarPrestamosPorNombreDeCliente(String nombre) throws Exception {
        conectar();
        List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo p WHERE p.cliente.nombre = :nombre")
                .setParameter("nombre", nombre)
                .getResultList();
        desconectar();
        return prestamos;
    }

    public Prestamo buscarPrestamoPorNombreDeCliente(String nombre) {
        conectar();
        Prestamo prestamo = (Prestamo) em.createQuery("SELECT p FROM Prestamo p WHERE p.cliente.nombre = :nombre")
                .setParameter("nombre", nombre)
                .getSingleResult();
        desconectar();
        return prestamo;
    }

}
