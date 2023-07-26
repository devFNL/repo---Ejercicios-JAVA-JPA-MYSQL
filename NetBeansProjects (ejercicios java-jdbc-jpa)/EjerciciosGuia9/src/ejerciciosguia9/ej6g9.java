/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia9;

import Entidad.Curso;

/**
 *
 * @author Jib
 */
public class ej6g9 {

    public static void main(String[] args) {

        Curso curso = new Curso();

        curso.cargarAlumnos();
//        curso.mostrarAlumnos();
        curso.crearCurso();
        curso.calcularGananciaSemanal();
        
    }
}
