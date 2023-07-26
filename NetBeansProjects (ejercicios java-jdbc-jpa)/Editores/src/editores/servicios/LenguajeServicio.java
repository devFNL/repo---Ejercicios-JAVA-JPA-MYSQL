/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editores.servicios;

import editores.entidades.Lenguaje;
import editores.entidades.Editor;
import editores.persistencias.LenguajeDAO;
import java.util.List;

/**
 *
 * @author Jib
 */
public class LenguajeServicio {

    private LenguajeDAO DAO;

    public LenguajeServicio() {
        this.DAO = new LenguajeDAO();
    }

    public Lenguaje crearLenguaje(String nombre, Editor editor) {

        try {

            Lenguaje lenguaje1 = new Lenguaje();
            lenguaje1.setNombre(nombre);
            lenguaje1.setEditor(editor);
            DAO.guardar(lenguaje1);

            return lenguaje1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Lenguaje buscarLenguajePorNombreDeEditor(String nombre) {
        try {
            return DAO.buscarLenguajePorNombreDeEditor(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Lenguaje> listarLenguajes(String nombre) {
        try {
            return DAO.listarLenguajePorNombreDeEditor(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
