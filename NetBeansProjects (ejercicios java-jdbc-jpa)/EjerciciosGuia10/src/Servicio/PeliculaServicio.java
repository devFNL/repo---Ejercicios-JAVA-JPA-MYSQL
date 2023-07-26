/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import static Utilidades.PeliculaComparadores.ordenarDirector;
import static Utilidades.PeliculaComparadores.ordenarDuracionMayor;
import static Utilidades.PeliculaComparadores.ordenarDuracionMenor;
import static Utilidades.PeliculaComparadores.ordenarTitulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class PeliculaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    private List<Pelicula> listaPelis = new ArrayList<>();

//    public void crearPeli() {
//
//        System.out.println("Ingrese el titulo");
//        String titulo = sc.next();
//        System.out.println("Ingrese el director");
//        String director = sc.next();
//        System.out.println("Ingrese duracion");
//        Double duracion = sc.nextDouble();
//
//        Pelicula pelicula = new Pelicula(titulo, director, duracion);
//
//        listaPelis.add(pelicula);
//
//    }
    
    public Pelicula crearPeli(){
        
        System.out.println("Ingrese el titulo");
        String titulo = sc.next();
        System.out.println("Ingrese el director");
        String director = sc.next();
        System.out.println("Ingrese duracion");
        Double duracion = sc.nextDouble();

        return new Pelicula(titulo, director, duracion);
    }
    
    public void agregarPeli(){
        listaPelis.add(crearPeli());
    }

    public void mostrarPeli() {

        listaPelis.forEach((aux) -> {
            System.out.println(aux.toString());
        });

    }
    
    public void ordenDuracion1Hr(){
        
        for (Pelicula aux : listaPelis) {
            if (aux.getDuracion() > 1.0) {
                System.out.println(aux);
            }
        }
        
    }

    public void ordenDuracionMayor() {

        Collections.sort(listaPelis, ordenarDuracionMayor);

//      tambien se puede usar sort en este caso porque mi lista vive dentro de servicio        
//        listaPelis.sort(ordenarDuracionMayor);
    }

    public void ordenDuracionMenor() {

        Collections.sort(listaPelis, ordenarDuracionMenor);

//        listaPelis.sort(ordenarDuracionMenor);
    }

    public void ordenTitulo() {

        Collections.sort(listaPelis, ordenarTitulo);

//        listaPelis.sort(ordenarTitulo);
    }

    public void ordenDirector() {

        Collections.sort(listaPelis, ordenarDirector);

//        listaPelis.sort(ordenarTitulo);
    }

    public void ordenar() {

        System.out.println("Peliculas ordenadas por duracion (de mayor a menor)");
        ordenDuracionMayor();
        mostrarPeli();

        System.out.println("Peliculas ordenadas por duracion (de menor a mayor)");
        ordenDuracionMenor();
        mostrarPeli();

        System.out.println("Peliculas ordenadas por titulo (alfabeticamente)");
        ordenTitulo();
        mostrarPeli();

        System.out.println("Peliculas ordenadas por director (alfabeticamente)");
        ordenDirector();
        mostrarPeli();
    }

}
