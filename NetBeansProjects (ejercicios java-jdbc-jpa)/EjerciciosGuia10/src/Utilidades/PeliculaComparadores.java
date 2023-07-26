/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Jib
 */
public class PeliculaComparadores {

    public static Comparator<Pelicula> ordenarDuracionMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

//            if (t.getDuracion() < t1.getDuracion()) {
//                return 1;
//            } else if (t.getDuracion() > t1.getDuracion()) {
//                return -1;
//            }
//            return 0;

            return t.getDuracion().compareTo(t1.getDuracion());

        }
    };

    public static Comparator<Pelicula> ordenarDuracionMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

//            if (t.getDuracion() > t1.getDuracion()) {
//                return 1;
//            } else if (t.getDuracion() < t1.getDuracion()) {
//                return -1;
//            }
//            return 0;
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };

    public static Comparator<Pelicula> ordenarTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };

    public static Comparator<Pelicula> ordenarDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t.getDirector().compareTo(t1.getTitulo());

        }
    };
    
}
