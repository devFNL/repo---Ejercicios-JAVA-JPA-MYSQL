/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgenum;

import Entidad.Mascota;
import Enum.RazaGato;
import Enum.RazaPerro;

/**
 *
 * @author Jib
 */
public class Enum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mascota m1 = new Mascota<RazaPerro>("Ringo", "Fingo", "Perro");
        
        m1.setRaza(RazaPerro.COLLIE.getCodigo());
        
        System.out.println(m1.toString());
        
        Mascota m2 = new Mascota<RazaGato>("Maven", "Nana", "Gato");
        
        m2.setRaza(RazaGato.PERSA);
        
        System.out.println(m2.toString());
        
    }
    
}
