/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editores;

import editores.entidades.Editor;
import editores.servicios.EditorServicio;
import editores.servicios.LenguajeServicio;

/**
 *
 * @author Jib
 */
public class Editores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EditorServicio es = new EditorServicio();
        LenguajeServicio ls = new LenguajeServicio();

        Editor editor1 = es.crearEditor("NetBeans");
        Editor editor2 = es.crearEditor("VSCode");
        Editor editor3 = es.crearEditor("Eclipse");
        Editor editor4 = es.crearEditor("IntelliJ");

        ls.crearLenguaje("java", editor1);
        ls.crearLenguaje("javascript", editor2);
        ls.crearLenguaje("php", editor3);
        ls.crearLenguaje("phyton", editor4);
        ls.crearLenguaje("c++", editor2);

    }

}
