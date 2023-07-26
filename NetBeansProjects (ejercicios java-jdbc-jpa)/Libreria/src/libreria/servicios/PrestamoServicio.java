/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.Date;
import java.util.List;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;
import libreria.persistencia.PrestamoDAO;

/**
 *
 * @author Jib
 */
public class PrestamoServicio {

    private final PrestamoDAO DAO;

    public PrestamoServicio() {
        this.DAO = new PrestamoDAO();
    }

    public Prestamo crearPrestamo(Cliente cliente, Libro libro, Date fechaPres, Date fechaDevo) {
        Prestamo prestamo = new Prestamo();
        try {

            prestamo.setFechaPrestamo(fechaPres);
            prestamo.setFechaDevolucion(fechaDevo);
            prestamo.setCliente(cliente);
            prestamo.setLibro(libro);
            DAO.guardar(prestamo);
            return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Prestamo> listarPrestamoPorCliente(String nombre) throws Exception {

        try {
            return DAO.listarPrestamosPorNombreDeCliente(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

}
