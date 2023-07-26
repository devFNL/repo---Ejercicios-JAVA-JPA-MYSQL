/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;

/**
 *
 * @author Jib
 */
public class AutorDAO extends DAO<Autor> {

    @Override
    public void guardar(Autor objeto) {
        super.guardar(objeto); //To change body of generated methods, choose Tools | Templates.
    }

    public void eliminar(String nombre) throws Exception {
        Autor autor = buscarAutorPorNombre(nombre);
        super.eliminar(autor);
    }

    @Override
    public void editar(Autor autor) {
        super.editar(autor); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Autor> listarAutores() {
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM autor a WHERE a.alta = 1").getResultList();
        desconectar();
        return autores;
    }

    public Autor buscarAutorPorNombre(String nombre) {
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre AND a.alta = 1")
                .setParameter("nombre", nombre)
                .getSingleResult();
        desconectar();
        return autor;
    }

}
