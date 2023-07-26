/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Jib
 */
public final class Perro extends Animal {

    public Perro(String nombre, String raza, String tipo, int edad) {
        super(nombre, raza, tipo, edad);
    }

    @Override
    public void hacerRuido() {
        System.out.println("Guau");
    }
    
    
    
    
    
    
}
