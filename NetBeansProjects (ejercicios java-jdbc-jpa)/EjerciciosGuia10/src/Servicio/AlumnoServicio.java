/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class AlumnoServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    private List<Alumno> listaAlum = new ArrayList();

//      este metodo haria todo, crear el objeto alumno y agregarlo a la lista
//    
//    public void crearAlumno() {
//
//        System.out.println("Ingrese el nombre de alumno");
//        String nombre = sc.next();
//
//        List<Integer> notas = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Ingrese la nota n°: " + (i+1));
//            int nota = sc.nextInt();
//            notas.add(nota);
//        }
//
//        Alumno alumno = new Alumno(nombre, notas);
//        listaAlum.add(alumno);
//
//    }
    
    
//          "es mejor" delegar y tener metodos mas especificos
//          este metodo solo crea el objeto    
    public Alumno crearAlumno(){
        System.out.println("Ingrese el nombre de alumno");
        String nombre = sc.next();

        List<Integer> notas = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota n°: " + (i+1));
//            int nota = sc.nextInt();
            notas.add(sc.nextInt());
        }

        return new Alumno(nombre, notas);
    }
//          se agrega a la lista. (solo se llama a este en el main ya que tiene el crear adentro
    public void agregarAlumno() {
        listaAlum.add(crearAlumno());
    }

    public double notaFinal(String nombreBuscar) {

        for (Alumno elementos : listaAlum) {
            if (elementos.getNombre().equalsIgnoreCase(nombreBuscar)) {
                List<Integer> notas = elementos.getNotas();
                double prom = ((notas.get(0) + notas.get(1) + notas.get(2)) / 3);
                System.out.println("El promedio es: " + prom);
                return prom;
            }

        }
        System.out.println("El alumno no esta en la lista");
        return 0;

    }
    
    

}
