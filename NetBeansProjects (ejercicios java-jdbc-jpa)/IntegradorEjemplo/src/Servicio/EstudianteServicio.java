/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Estudiante;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class EstudianteServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Estudiante crearAlumno() {

        System.out.println("Ingrese nombre del alumno");
        String nombre = sc.next();

        System.out.println("Ingrese nota final");
        double nota = sc.nextDouble();

        return new Estudiante(nombre, nota);
    }

    public Estudiante[] crearEtudiantes() {

        System.out.println("Ingrese la cantidad de alumnos");
        int cantAlumnos = sc.nextInt();

        Estudiante[] estudiantes = new Estudiante[cantAlumnos];

        for (int i = 0; i < cantAlumnos; i++) {
            estudiantes[i] = crearAlumno();
        }
        return estudiantes;
    }

    public double calcProm(Estudiante[] estudiantes) {

        double suma = 0;

        for (Estudiante elemento : estudiantes) {
            suma += elemento.getNota();
        }

        return (suma / estudiantes.length);

    }

    public String[] nombres(Estudiante[] estudiantes, double prom) {

        String[] nombres = new String[estudiantes.length];

        int cont = 0;
        

        

        for (Estudiante elemento : estudiantes) {
            if (elemento.getNota() > prom) {
                nombres[cont] = elemento.getNombre();
                cont++;

            }
        }

        String[] nombresVector = new String[cont];
        
        

        System.arraycopy(nombres, 0, nombresVector, 0, cont);

        return nombresVector;

    }

    public void mostrar(Estudiante[] estudiantes, double prom) {
        System.out.println("Estudiantes con notas mayores al promedio");
        System.out.println(Arrays.toString(nombres(estudiantes, prom)));
    }

}
