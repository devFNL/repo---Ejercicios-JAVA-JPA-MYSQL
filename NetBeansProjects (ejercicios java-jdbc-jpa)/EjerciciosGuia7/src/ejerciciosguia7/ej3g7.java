/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia7;

import Entidad.Operacion;

/**
 *
 * @author Jib
 */
public class ej3g7 {

    public static void main(String[] args) {

        Operacion uno = new Operacion();

        uno.crearOperacion();
        
        System.out.println("La suma es " + uno.sumar());
        System.out.println("La resta es " + uno.restar());
        System.out.println("La multiplicacion es " + uno.multiplicar());
        System.out.println("La division es " + uno.dividir());
    }

}
