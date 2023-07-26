/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class Cancion {
    
    public String titulo;
    public String autor;
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Cancion() {
        this.titulo = null;
        this.autor = null;
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public void crearCancion(){
        System.out.println("Ingrese el titulo: ");
        this.titulo = sc.next();
        System.out.println("Ingrese el autor: ");
        this.autor = sc.next();
    }
    
    public void mostrarCancion(){
        System.out.println("El titulo es: " + titulo);
        System.out.println("El autor es: " + autor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
}
