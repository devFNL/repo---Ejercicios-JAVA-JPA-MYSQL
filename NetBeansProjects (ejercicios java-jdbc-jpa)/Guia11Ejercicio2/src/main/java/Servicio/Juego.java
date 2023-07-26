/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class Juego {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Jugador> jugadores;
    private Revolver rev;

    public Juego() {
        jugadores = new ArrayList<>();
        rev = new Revolver();
    }
//
//    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver rev) {
//        this.jugadores = jugadores;
//        this.rev = rev;
//    }

    public void llenarJugadores() {
        System.out.println("Ingrese la cantidad de jugadores");
        int cantJugadores = sc.nextInt();
        if (cantJugadores > 6) {
           cantJugadores = 6; 
        }
        for (int i = 0; i < cantJugadores; i++) {
            this.jugadores.add(new Jugador(i + 1));
        }
    }

    public void ronda() {
        boolean mojado = false;
        int jugadorActual = 0;
        int cantJugadores = jugadores.size();
        while (!mojado) {
            Jugador jugador = jugadores.get(jugadorActual);
            System.out.println("Es el turno del jugador: " + jugador.getNombre());
            mojado = jugador.disparo(rev);
            if (mojado) {
                System.out.println("El jugador " + jugador.getNombre() + " perdio el juego!");
            } else {
                jugadorActual = (jugadorActual + 1) % cantJugadores;
            }
        }
    }
    
    public void reset() {
        jugadores.clear();
        rev = new Revolver();
    }

    public void juego() {
        reset();
        llenarJugadores();
        rev.llenarRevolver();
        ronda();

    }
}
