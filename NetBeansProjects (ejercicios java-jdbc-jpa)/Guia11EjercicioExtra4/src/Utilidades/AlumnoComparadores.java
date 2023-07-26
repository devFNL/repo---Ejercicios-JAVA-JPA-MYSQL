/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import Entidad.Alumno;
import java.util.Comparator;

/**
 *
 * @author Jib
 */
public class AlumnoComparadores {
    
    public static Comparator<Alumno> ordenarVotos = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno o1, Alumno o2) {
            return o2.getVotos().compareTo(o1.getVotos());
        }
    };
    
    
}
