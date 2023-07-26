/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class AhorcadoServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {

        System.out.println("Ingrese la palabra a adivinar:");
        String adiv = sc.next();

        System.out.println("Ingrese la cantidad de intentos maximos:");
        int intentos = sc.nextInt();

        String[] palabra = new String[adiv.length()];

        for (int i = 0; i < palabra.length; i++) {
            palabra[i] = adiv.substring(i, i + 1);

        }

        return new Ahorcado(palabra, intentos);

    }

    public void longitud(Ahorcado juego) {
        System.out.println("La longitud de la palabra a buscar es: " + (juego.getPalabra().length));

    }

    public boolean buscar(Ahorcado juego, String letra) {

        boolean buscar = false;
        String[] palabra = juego.getPalabra();

        for (String elementos : palabra) {
            if (elementos.equalsIgnoreCase(letra)) {
                buscar = true;
            }
        }

        return buscar;
    }

    public boolean encontradas(Ahorcado juego, String letra) {

        boolean busqueda = buscar(juego, letra);
        int letras = 0;

        if (busqueda) {

            for (int i = 0; i < juego.getPalabra().length; i++) {
                if (juego.getPalabra()[i].equalsIgnoreCase(letra)) {
                    letras++;
                }
            }

            System.out.println("Encontraste una letra! Letras encontradas: " + letras);
            juego.setLetras(juego.getLetras() + letras);
            System.out.println("Letras encontradas en total: " + juego.getLetras());
            System.out.println("Letras faltantes: " + (juego.getPalabra().length - juego.getLetras()));

            return true;

        } else {
            System.out.println("La letra no esta en la palabra, se resta un intento");
            juego.setIntentos(juego.getIntentos() - 1);
            return false;
        }

    }

    public void intentos(Ahorcado juego) {
        System.out.println("Tienes : " + juego.getIntentos() + " intentos");
    }

    public void juego() {

        Ahorcado juego = crearJuego();
        longitud(juego);

        do {
            System.out.println("Ingrese letra a buscar");
            String letraBuscar = sc.next();
            encontradas(juego, letraBuscar);
            intentos(juego);

        } while (juego.getIntentos() > 0 && (juego.getLetras() < juego.getPalabra().length));

        if (juego.getLetras() == juego.getPalabra().length) {
            System.out.println("Ganaste! La palabra es: " + Arrays.toString(juego.getPalabra()));
        } else {
            System.out.println("Perdiste. La palabra era: " + Arrays.toString(juego.getPalabra()));
        }
    }

}
