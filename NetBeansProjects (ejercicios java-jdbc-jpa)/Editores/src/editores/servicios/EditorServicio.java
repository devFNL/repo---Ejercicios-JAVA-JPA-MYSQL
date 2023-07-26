/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editores.servicios;

import editores.entidades.Editor;
import editores.persistencias.EditorDAO;

/**
 *
 * @author Jib
 */
public class EditorServicio {

    private final EditorDAO DAO;

    public EditorServicio() {
        this.DAO = new EditorDAO();
    }

    public Editor crearEditor(String nombre) {

        try {

            Editor editor1 = new Editor();
            editor1.setNombre(nombre);
            DAO.guardar(editor1);

            return editor1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
