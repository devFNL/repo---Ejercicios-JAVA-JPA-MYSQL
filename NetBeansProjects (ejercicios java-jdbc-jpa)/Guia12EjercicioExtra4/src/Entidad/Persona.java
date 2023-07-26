/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class Persona {

    public static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    protected String nombre;
    protected String apellido;
    protected int dni;
    protected String estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int dni, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }

    public void cambiarEstadoCivil() {
        this.estadoCivil = sc.next();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void mostrarPersona() {
        System.out.println("Nombre: " + nombre + ", Apellido: " + apellido + ", DNI: " + dni + ", Estado Civil: " + estadoCivil);
    }

    @Override
    public String toString() {
        return "Persona{ " + "Nombre: " + nombre + ", Apellido: " + apellido + ", DNI: " + dni + ", Estado Civil: " + estadoCivil + '}';
    }

}
