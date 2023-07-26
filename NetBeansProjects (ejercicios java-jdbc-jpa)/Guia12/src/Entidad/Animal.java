/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Interfaces.AnimalAccion;

/**
 *
 * @author Jib
 */
public class Animal implements AnimalAccion {
    
    protected String nombre;
    protected String raza;
    protected String tipo;
    protected int edad;

    public Animal() {
    }

    public Animal(String nombre, String raza, String tipo, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tipo = tipo;
        this.edad = edad;
    }
    
    public void hacerRuido(){
        System.out.println("Hola");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", raza=" + raza + ", tipo=" + tipo + ", edad=" + edad + '}';
    }

    @Override
    public void pasear(int cantVueltas) {
        System.out.println("La mascota dio: " + cantVueltas);
    }
    
    @Override
    public void comer(int cantComida) {
        System.out.println("La mascota comio: " + cantComida);
    }

    @Override
    public void mostrarEdad() {
        System.out.println("La mascota tiene: " + edad + " años.");
    }
    
    
    
    
}
