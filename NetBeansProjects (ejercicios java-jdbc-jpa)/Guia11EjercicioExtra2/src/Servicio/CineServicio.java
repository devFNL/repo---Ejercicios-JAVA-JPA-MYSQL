/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Asiento;
import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class CineServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Random random = new Random();

    List<Espectador> espectadores;
    List<Espectador> espectadoresAptos;
    Pelicula pelicula;
    Cine cine;
    Asiento[][] sala;

    public CineServicio() {
        pelicula = new Pelicula();
        cine = new Cine();
        espectadores = new ArrayList();
        espectadoresAptos = new ArrayList();
        sala = new Asiento[8][6];
    }

    public void crearPelicula() {

        pelicula.setTitulo("Avatar");
        pelicula.setDuracion(162);
        pelicula.setEdadMinima(13);
        pelicula.setDirector("James Cameron");

    }

    public void crearSala() {

        String[] filas = {"8", "7", "6", "5", "4", "3", "2", "1"};
        String[] columnas = {"A", "B", "C", "D", "E", "F"};
//        boolean[] lleno = {true, false};

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                boolean ocupado = random.nextBoolean();
                sala[i][j] = new Asiento(filas[i], columnas[j], ocupado);
            }
        }
//      lo habia hecho con el array "lleno"
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 6; j++) {
//                sala[i][j] = new Asiento(filas[i], columnas[j], lleno[(int) (Math.random() * 2)]);
//            }
//        }
    }

    public void crearCine() {
        cine.setPelicula(pelicula);
        cine.setPrecioEntrada(500);
        crearSala();
        cine.setSala(sala);
    }

    public void listaEspectadores() {

        Espectador e1 = new Espectador("Federico", 30, 3000);
        Espectador e2 = new Espectador("Ana", 10, 7000);
        Espectador e3 = new Espectador("Matias", 50, 2000);
        Espectador e4 = new Espectador("Florencia", 25, 2500);
        Espectador e5 = new Espectador("Mauro", 13, 600);
        Espectador e6 = new Espectador("Luz", 35, 200);
        Espectador e7 = new Espectador("Sebastian", 20, 4000);
        Espectador e8 = new Espectador("Victoria", 55, 300);
        Espectador e9 = new Espectador("Miguel", 18, 7000);

        espectadores.add(e1);
        espectadores.add(e2);
        espectadores.add(e3);
        espectadores.add(e4);
        espectadores.add(e5);
        espectadores.add(e6);
        espectadores.add(e7);
        espectadores.add(e8);
        espectadores.add(e9);

    }

    public void verListaEspectadores() {
        for (Espectador aux : espectadores) {
            System.out.println(aux);
        }
        
        System.out.println("Total de espectadores: " + espectadores.size());
    }

    public void listaEspectadoresAptos() {

        for (Espectador aux : espectadores) {

            if (aux.getEdad() >= pelicula.getEdadMinima() && aux.getDinero() >= cine.getPrecioEntrada()) {
                espectadoresAptos.add(aux);
            }

        }

    }

    public void verListaEspectadoresAptos() {
        for (Espectador aux : espectadoresAptos) {
            System.out.println(aux);
        }

        System.out.println("Espectadores aptos: " + espectadoresAptos.size());

    }

    public void verSala() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (sala[i][j].isOcupado()) {
                    System.out.print(sala[i][j].getFila() + "" + sala[i][j].getColumna() + " X" + " |");
                } else {
                    System.out.print(sala[i][j].getFila() + "" + sala[i][j].getColumna() + "  " + " |");
                }
            }
            System.out.println();
        }
    }

    public void asignarAsiento() {

        for (Espectador aux : espectadoresAptos) {
            boolean asientoAsignado = false;

            while (!asientoAsignado) {
//                int fila = (int) (Math.random() * 8);
//                int columna = (int) (Math.random() * 6);

                int fila = random.nextInt(8);
                int columna = random.nextInt(6);

                if (!sala[fila][columna].isOcupado()) {
                    sala[fila][columna].setOcupado(true);
                    asientoAsignado = true;
                }
            }
        }
    }

    public void menu() {

        crearPelicula();
        crearCine();
        System.out.println("*** Disposicion de la sala actual ***");
        verSala();
        System.out.println("Informacion de la pelicula: ");
        System.out.println(pelicula.toString());
        System.out.println("Precio de la entrada: ");
        System.out.println("$ " + cine.getPrecioEntrada());
        System.out.println("Lista de espectadores que quieren entrar: ");
        listaEspectadores();
        verListaEspectadores();
        System.out.println("Lista de espectadores que cumplen con las condiciones: ");
        listaEspectadoresAptos();
        verListaEspectadoresAptos();
        asignarAsiento();
        System.out.println("*** Disposicion de la sala luego de ubicar los espectadores ***");
        verSala();

    }

}
