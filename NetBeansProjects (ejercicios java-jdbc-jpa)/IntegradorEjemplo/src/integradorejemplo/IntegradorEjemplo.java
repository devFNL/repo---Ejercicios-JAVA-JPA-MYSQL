/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradorejemplo;

import Entidad.Estudiante;
import Servicio.EstudianteServicio;

/**
 *
 * @author Jib
 */
public class IntegradorEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        EstudianteServicio serv = new EstudianteServicio();
        Estudiante[] estudiantes = serv.crearEtudiantes();

        double promedio = serv.calcProm(estudiantes);

        System.out.println("El promedio del curso es: " + promedio);
        serv.mostrar(estudiantes, promedio);

    }
}
