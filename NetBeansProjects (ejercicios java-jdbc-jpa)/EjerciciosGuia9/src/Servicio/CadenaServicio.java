/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class CadenaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearFrase() {

        System.out.println("Ingrese una frase");
        String frase = sc.next();

        return new Cadena(frase);

    }

    public void mostrarVocales(Cadena cadena) {

        int vocales = 0;
        
        String vocal = "aeiouAEIOU";
        
        for (int i = 0; i < cadena.getLongFrase(); i++) {
            
            String letra = cadena.getFrase().substring(i, i+1);
            if (vocal.contains(letra)){
                vocales++;
            }
        }

//        for (int i = 0; i < cadena.getLongFrase(); i++) {
//
//            String letra = cadena.getFrase().substring(i, i + 1);
//            if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
//                vocales++;
//            }
//        }
        System.out.println("En la frase hay: " + vocales + " vocales");
    }

    public void invertirFrase(Cadena cadena) {

        for (int i = cadena.getLongFrase() - 1; i >= 0; i--) {
            System.out.print(cadena.getFrase().substring(i, i + 1));
        }
        System.out.println();

    }

    public void vecesRepetida(Cadena cadena) {

        System.out.println("Ingrese una letra");
        String letra = sc.next();

        int cont = 0;

        for (int i = 0; i < cadena.getLongFrase(); i++) {
            if (cadena.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                cont++;
            }
        }

        System.out.println("La letra: " + letra + " esta repetida: " + cont + " veces");

    }

    public void compararLongitud(Cadena cadena) {

        System.out.println("Ingrese otra frase para comparar");
        String frase2 = sc.next();
        
        Integer i1 = frase2.length();
        Integer i2 = cadena.getLongFrase();
        int comparacion = i1.compareTo(i2);
        
        
        
        if (comparacion == 0) {
            System.out.println("Las frases tienen la misma longitud");
        } else if (comparacion < 0) {
            System.out.println("La segunda frase es mas larga que la primera");
        } else {
            System.out.println("La primera frase es mas larga que la segunda");
        }

//        if (cadena.getLongFrase() == frase2.length()) {
//            System.out.println("Las frases tienen la misma longitud");
//        } else {
//            System.out.println("Las frases tienen distinta longitud");
//        }

    }

    public void unirFrases(Cadena cadena) {

        System.out.println("Ingrese la frase que quiere concatenar");
        String frase2 = sc.next();

        String fraseUnida = cadena.getFrase().concat(frase2);
        System.out.println("La frase unida es: " + fraseUnida);

    }

    public void reemplazar(Cadena cadena) {

        System.out.println("Ingrese una letra para reemplazar la letra: A");
        String letra = sc.next();
        String fraseReemplazada = cadena.getFrase().replace("A", letra).replace("a", letra);

        System.out.println("La frase modificada es: " + fraseReemplazada);

    }

    public boolean contiene(Cadena cadena) {

        System.out.println("Ingrese una letra para comprobar si la frase la contiene");
        String letraRep = sc.next();

        boolean repe = false;

        if (cadena.getFrase().contains(letraRep)) {
            repe = true;
        }

        System.out.println(repe);
        return repe;

    }

}
