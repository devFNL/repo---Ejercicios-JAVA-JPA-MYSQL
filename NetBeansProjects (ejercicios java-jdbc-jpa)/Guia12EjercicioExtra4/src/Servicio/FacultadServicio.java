/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Empleado;
import Entidad.Estudiante;
import Entidad.Persona;
import Entidad.PersonalDeServicio;
import Entidad.Profesor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class FacultadServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    List<Persona> personas = new ArrayList<>();

    public void llenarLista() {

        personas.add(new Profesor("Matematicas", "Profesor", 2015, 4, "Jorge", "Rojas", 25478965, "Casado"));
        personas.add(new Profesor("Idiomas", "Profesor", 2018, 12, "Maximiliano", "Ruiz", 31665823, "Soltero"));
        personas.add(new Profesor("Arquitectura", "Profesora", 2009, 9, "Celeste", "Avellaneda", 5887454, "Viuda"));
        personas.add(new Profesor("Diseño", "Profesora", 2020, 14, "Julieta", "Martiz", 32551487, "Soltera"));

        personas.add(new Estudiante("3C", "Florencia", "Martinez", 39654987, "Soltera"));
        personas.add(new Estudiante("2B", "Maria", "De Marco", 40654784, "Soltera"));
        personas.add(new Estudiante("8F", "Javier", "Gronte", 42654988, "Casado"));
        personas.add(new Estudiante("9A", "Walter", "Pintos", 30215465, "Soltero"));

        personas.add(new PersonalDeServicio("Limpieza", "Servicio", 2021, 60, "Fabio", "Jonas", 29654784, "Soltero"));
        personas.add(new PersonalDeServicio("Mantenimiento", "Servicio", 2019, 65, "Ivan", "Rubio", 38654784, "Casado"));
        personas.add(new PersonalDeServicio("Jardin", "Servicio", 2005, 52, "Clara", "Peria", 39654874, "Soltera"));
        personas.add(new PersonalDeServicio("Limpieza", "Servicio", 2020, 55, "Nicolas", "Ceballos", 42154874, "Soltero"));

    }

    public void mostrarLista() {

        System.out.println("Lista completa de personas: ");
        for (Persona aux : personas) {
            System.out.println(aux.toString());

        }

    }

    public void mostrarProfesores() {

        System.out.println("Lista de profesores: ");

        for (Persona aux : personas) {
            if (aux instanceof Profesor) {
                System.out.println(aux.toString());
            }
        }
    }

    public void mostrarEstudiantes() {

        System.out.println("Lista de estudiantes: ");

        for (Persona aux : personas) {
            if (aux instanceof Estudiante) {
                System.out.println(aux.toString());
            }
        }
    }

    public void mostrarPersonal() {

        System.out.println("Lista de personal de servicio: ");

        for (Persona aux : personas) {
            if (aux instanceof PersonalDeServicio) {
                System.out.println(aux.toString());
            }
        }
    }

    public void cambiarEstadoCivil() {

        System.out.println("Ingrese el DNI de la persona a cambiar el estado civil");
        int dniBuscar = sc.nextInt();
        boolean valid = false;

        for (Persona aux : personas) {
            if (aux.getDni() == dniBuscar) {
                System.out.println("Ingrese el nuevo estado civil para: " + aux.getNombre() + " " + aux.getApellido());
                aux.cambiarEstadoCivil();
                break;
            }

        }

        if (!valid) {
            System.out.println("No se encontro una persona con ese numero de DNI");
        }

    }

    public void reasignarDespacho() {

        System.out.println("Ingrese el DNI del empleado a cambiar el despacho");
        int dniBuscar = sc.nextInt();
        boolean valid = false;

        for (Persona aux : personas) {

            if (aux instanceof Empleado && aux.getDni() == dniBuscar) {
                // se crea una variable auxiliar CASTEADA() al tipo de objeto para poder acceder a los metodos de esa clase
                Empleado empleadoAux = (Empleado) aux;
                System.out.println("Ingrese el nuevo numero de despacho para: " + aux.getNombre() + " " + aux.getApellido());
                empleadoAux.cambiarDespacho();
                valid = true;
                break;
            }
        }

        if (!valid) {
            System.out.println("No se encontro la persona con ese DNI");
        }

    }

    public void cambiarCursoEstudiante() {

        System.out.println("Ingrese el DNI del estudiante a cambiar el curso");
        int dniBuscar = sc.nextInt();
        boolean valid = false;

        for (Persona aux : personas) {
            if (aux instanceof Estudiante && aux.getDni() == dniBuscar) {
                Estudiante estudianteAux = (Estudiante) aux;
                System.out.println("Ingrese el nombre del nuevo curso para: " + aux.getNombre() + " " + aux.getApellido());
                estudianteAux.cambiarCurso();
                valid = true;
                break;

            }
        }

        if (!valid) {
            System.out.println("No se encontro la persona con ese DNI");
        }
    }

    public void cambiarDepartamento() {

        System.out.println("Ingrese el DNI del profesor a cambiar el departamento");
        int dniBuscar = sc.nextInt();
        boolean valid = false;

        for (Persona aux : personas) {
            if (aux instanceof Profesor && aux.getDni() == dniBuscar) {
                Profesor profesorAux = (Profesor) aux;
                System.out.println("Ingrese el nuevo departamento para: " + aux.getNombre() + " " + aux.getApellido());
                profesorAux.cambiarDepartamento();
                valid = true;
                break;

            }
        }

        if (!valid) {
            System.out.println("No se encontro la persona con ese DNI");
        }
    }

    public void cambiarSeccion() {

        System.out.println("Ingrese el DNI del empleado a cambiar la seccion");
        int dniBuscar = sc.nextInt();
        boolean valid = false;

        for (Persona aux : personas) {
            if (aux instanceof PersonalDeServicio && aux.getDni() == dniBuscar) {
                PersonalDeServicio personalDeServicioAux = (PersonalDeServicio) aux;
                System.out.println("Ingrese la nueva seccion para: " + aux.getNombre() + " " + aux.getApellido());
                personalDeServicioAux.cambiarSeccion();
                valid = true;
                break;

            }
        }

        if (!valid) {
            System.out.println("No se encontro la persona con ese DNI");
        }
    }

    public void menu() {

        llenarLista();

        int opc;

        do {
            System.out.println("*** Facultad ***");
            System.out.println("1. Ver la lista completa de personas");
            System.out.println("2. Ver la lista de profesores");
            System.out.println("3. Ver la lista de estudiantes");
            System.out.println("4. Ver la lista de personal de servicio");
            System.out.println("5. Cambiar el estado civil de una persona");
            System.out.println("6. Reasignacion de despacho a un empleado");
            System.out.println("7. Matriculacion de un estudiante en un nuevo curso");
            System.out.println("8. Cambio de departamento de un profesor");
            System.out.println("9. Traslado de seccion de un empleado del personal de servicio");
            System.out.println("10. Salir.");
            System.out.println("Ingrese una opcion: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    mostrarLista();
                    break;
                case 2:
                    mostrarProfesores();
                    break;
                case 3:
                    mostrarEstudiantes();
                    break;
                case 4:
                    mostrarPersonal();
                    break;
                case 5:
                    cambiarEstadoCivil();
                    break;
                case 6:
                    reasignarDespacho();
                    break;
                case 7:
                    cambiarCursoEstudiante();
                    break;
                case 8:
                    cambiarDepartamento();
                    break;
                case 9:
                    cambiarSeccion();
                    break;
                case 10:
                    System.out.println("Saliste.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;

            }

        } while (opc != 7);
    }
}
