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
public class Juego {
    
    public int num1, num2, win1, win2, rondas;
    public int inten = 3;
    Scanner sc = new Scanner(System.in);
    
    public void iniciarJuego() {

        System.out.println("Juego de adivinanza de numeros");
        System.out.println("Ingrese la cantidad de rondas a jugar");
        this.rondas = sc.nextInt();
        
        for (int i = 0; i < rondas; i++) {
            
           System.out.println("Jugador n°1 ingrese un numero del 1 al 10");
            this.num1 = sc.nextInt();
            do {
                System.out.println("Jugador n°2 intente adivinar el numero. Tiene " + inten + " intentos.");
                this.num2 = sc.nextInt();
                if (num2 == num1) {
                    System.out.println("Adivinaste el numero!");
                    win2++;
                    break;
                } else {
                    if (num2 > num1) {
                    System.out.println("Un poco mas bajo...");
                    inten--;
                    } else { 
                    System.out.println("Un poco mas alto...");
                    inten--;
                }
                }
            } while (inten != 0);
            
            if (inten == 0) {
                win1++;
            }
            
            inten = 3; 
            
            System.out.println("¡¡¡ Fin de la ronda !!!");
            System.out.println("Puntos del jugador 1: " + win1);
            System.out.println("Puntos del jugador 2: " + win2);

        }
            

    }
}

