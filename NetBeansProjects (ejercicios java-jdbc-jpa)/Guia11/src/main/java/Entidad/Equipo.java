/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class Equipo {
    
    List<Jugador> jugadores = new ArrayList<>();
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Jugador crearJugador(){
        
        System.out.println("Ingrese el nombre");
        String nombre = sc.next();
        
        System.out.println("Ingrese el apellido");
        String apellido = sc.next();
        
        System.out.println("Ingrese la posicion");
        int posicion = sc.nextInt();
        
        System.out.println("Ingrese el numero");
        int numero = sc.nextInt();
        
        return new Jugador(nombre, apellido, posicion, numero);
    }
    
    public void agregarJugador(){
        jugadores.add(crearJugador());
    }
    
    public void mostrarEquipo(){
        for (Jugador aux : jugadores) {
            System.out.println(aux);
        }
    }
    
    public void menu(){
        
        String resp;
        
        do {            
        
            agregarJugador();
            System.out.println("Desea ingresar otro jugador al equipo?");
            resp = sc.next();
            
        } while (resp.equalsIgnoreCase("si"));
        
        mostrarEquipo();
        
        
    }
}
