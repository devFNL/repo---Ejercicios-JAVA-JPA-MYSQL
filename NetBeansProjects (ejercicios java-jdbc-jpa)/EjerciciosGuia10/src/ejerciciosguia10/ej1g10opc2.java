/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class ej1g10opc2 {
    public static void main(String[] args) {
        
        // opc 2, sin clase servicio
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        List<String> mascotas = new ArrayList();
        
        String resp = "";
        
        do {            
            
            System.out.println("Ingrese una raza");
            mascotas.add(sc.next());
            System.out.println("Desea ingresar otra raza?");
            resp = sc.next();
            
            
        } while (resp.equalsIgnoreCase("si"));
        
        
        for (String aux : mascotas) {
            System.out.println(aux);
        }
        
    }
}
