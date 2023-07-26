/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Editorial;

/**
 *
 * @author Jib
 */
public class EditorialDAO extends DAO<Editorial> {

    @Override
    public void guardar(Editorial editorial) {
        super.guardar(editorial); //To change body of generated methods, choose Tools | Templates.
    }

    public void eliminar(String nombre) {
        Editorial editorial = buscarEditorialPorNombre(nombre);
        super.eliminar(editorial);
    }

    @Override
    public void editar(Editorial editorial) {
        super.editar(editorial); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Editorial> listarEditoriales() throws Exception {
        conectar();
        List<Editorial> editoriales = em.createQuery("SELECT e FROM editorial e WHERE e.alta = 1").getResultList();
        desconectar();
        return editoriales;
    }

    public Editorial buscarEditorialPorNombre(String nombre) {
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.nombre = :nombre AND e.alta = 1")
                .setParameter("nombre", nombre)
                .getSingleResult();
        desconectar();
        return editorial;
    }

}
