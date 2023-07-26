/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alumno;
import Entidad.Voto;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Jib
 */
public class Simulador {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    List<String> listaNombres;
    Set<Integer> conjuntoDni;
    List<Integer> listaDni;
    List<Alumno> alumnos;
    List<Voto> listaVotos;
    List<Alumno> facilitadores;
    List<Alumno> facilitadoresSup;

    public Simulador() {
        listaNombres = new ArrayList<>();
        conjuntoDni = new HashSet<>();
        listaDni = new ArrayList<>();
        alumnos = new ArrayList<>();
        listaVotos = new ArrayList<>();
        facilitadores = new ArrayList<>();
        facilitadoresSup = new ArrayList<>();
    }

    public void crearListaNombres(int cantAlum) {
        String nombres[] = {"Oscar", "Maria", "Jose", "Florencia", "Federico", "Agostina", "Elio", "Luz", "Juan", "Julieta", "Sebastian", "Ana", "Dario", "Anabel", "Maximiliano", "Luciana"};
        String apellidos[] = {"Ceballos", "Rojas", "Castillo", "Rodriguez", "Lunera", "Furon", "Salazar", "Ferreyra", "Mora", "Gutierrez", "Dominguez"};

        for (int i = 0; i < cantAlum; i++) {
            String nombreCompleto = nombres[(int) (Math.random() * nombres.length)] + " " + apellidos[(int) (Math.random() * apellidos.length)];
            listaNombres.add(nombreCompleto);
        }

    }

    public void crearSetDni(int cantAlum) {

        int dniMax = 40000000;
        int dniMin = 20000000;

        do {
            int numeroDni = (int) (Math.random() * (dniMax - dniMin + 1)) + dniMin;
            conjuntoDni.add(numeroDni);
        } while (conjuntoDni.size() <= cantAlum);

    }

    public void transformarListaDni() {

        listaDni = new ArrayList(conjuntoDni);

    }

    public void crearListaAlumnos(int cantAlum) {

        for (int i = 0; i < cantAlum; i++) {
            String nombre = listaNombres.get(i);
            int dni = listaDni.get(i);

            alumnos.add(new Alumno(nombre, dni));
        }

    }

    public void votacion() {

        for (Alumno aux : alumnos) {

            List<Alumno> votados = new ArrayList<>();

            System.out.println(aux.getNombre() + " esta votando...");

            while (votados.size() < 3) {
                Alumno votado = alumnos.get((int) (Math.random() * alumnos.size()));
                if (!votado.equals(aux) && !votados.contains(votado)) {
                    votados.add(votado);
                    votado.setVotos(votado.getVotos() + 1);
                }
            }

            listaVotos.add(new Voto(aux, votados));

        }
    }

    public void mostrarVotos() {

        for (Voto aux : listaVotos) {
            System.out.println(aux);
        }

    }

    public void mostrarAlumnos() {

        for (Alumno aux : alumnos) {
            System.out.println(aux);
        }
    }

    public void recuento() {

        int suma = 0;

        for (Alumno aux : alumnos) {
            suma += aux.getVotos();
        }

        System.out.println("La suma total de votos es: " + suma);
    }

    public void crearFacilitadores() {

        // de menor a mayor.
        // hoteles.sort(Comparator.comparing(Hotel::getPrecio)
        // de mayor a menor.
        // hoteles.sort(Comparator.comparing(Hotel::getPrecio)
        //              .reversed()
        alumnos.sort(Comparator.comparing(Alumno::getVotos).reversed());
//        Collections.sort(alumnos, ordenarVotos);

        for (int i = 0; i < 5; i++) {
            facilitadores.add(alumnos.get(i));
        }

        for (int i = 5; i < 10; i++) {
            facilitadoresSup.add(alumnos.get(i));
        }

    }

    public void mostrarFacilitadores() {
        for (Alumno aux : facilitadores) {
            System.out.println(aux);
        }
    }

    public void mostrarFacilitadoresSup() {
        for (Alumno aux : facilitadoresSup) {
            System.out.println(aux);
        }
    }

    public void menu() {

        System.out.println("Ingrese la cantidad de alumnos a generar: ");
        int cantAlum = sc.nextInt();

        crearListaNombres(cantAlum);
        crearSetDni(cantAlum);
        transformarListaDni();
        crearListaAlumnos(cantAlum);

        System.out.println("Lista de alumnos: ");
        mostrarAlumnos();

        System.out.println("Voto");
        votacion();

        System.out.println("Lista de alumnos y a quien voto cada uno");
        mostrarVotos();

        System.out.println("Lista de alumnos con sus respectivos votos: ");
        mostrarAlumnos();

        System.out.println("Recuento de votos...");
        recuento();

        crearFacilitadores();

        System.out.println("Facilitadores: ");
        mostrarFacilitadores();

        System.out.println("Facilitadores Suplentes");
        mostrarFacilitadoresSup();

    }

}
