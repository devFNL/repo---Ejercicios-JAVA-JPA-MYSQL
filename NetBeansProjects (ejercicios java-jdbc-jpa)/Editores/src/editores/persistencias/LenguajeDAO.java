/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editores.persistencias;

import editores.entidades.Lenguaje;
import java.util.List;

/**
 *
 * @author Jib
 */
public final class LenguajeDAO extends DAO<Lenguaje> {

    @Override
    public void eliminar(Lenguaje objeto) {
        super.eliminar(objeto); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Lenguaje objeto) {
        super.editar(objeto); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar(Lenguaje objeto) {
        super.guardar(objeto); //To change body of generated methods, choose Tools | Templates.
    }

    public Lenguaje buscarLenguajePorNombreDeEditor(String editor) {

        conectar();
        Lenguaje lenguaje1 = (Lenguaje) em.createQuery("SELECT le FROM Lenguaje le WHERE le.editor.nombre = :nombre")
                .setParameter("nombre", editor)
                .getSingleResult();

        desconectar();
        return lenguaje1;

    }

    public List<Lenguaje> listarLenguajePorNombreDeEditor(String editor) {

        conectar();
        List<Lenguaje> lenguajes = em.createQuery("SELECT le FROM Lenguaje le WHERE le.editor.nombre = :nombre")
                .setParameter("nombre", editor)
                .getResultList();

        desconectar();
        return lenguajes;

    }

}
