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
public class Libro {

    public int ISBN;
    public String titulo;
    public String autor;
    public int numPag;

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public void cargarLibro() {

        System.out.println("Cargar Libro...");
        System.out.println("Ingrese ISBN: ");
        this.ISBN = sc.nextInt();
        System.out.println("Ingrese titulo: ");
        this.titulo = sc.next();
        System.out.println("Ingrese autor: ");
        this.autor = sc.next();
        System.out.println("Ingrese numero de paginas: ");
        this.numPag = sc.nextInt();

    }

    public void mostrarLibro() {
        System.out.println("El ISBN es: " + ISBN);
        System.out.println("El titulo es: " + titulo);
        System.out.println("El autor es: " + autor);
        System.out.println("El numero de paginas es: " + numPag);
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
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

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

}
