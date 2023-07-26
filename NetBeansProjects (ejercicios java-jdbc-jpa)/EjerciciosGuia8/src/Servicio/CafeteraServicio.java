/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class CafeteraServicio {

    Scanner sc = new Scanner(System.in);

    public void llenarCafetera(Cafetera cafe) {
        int max = cafe.getCapMax();
//        cafe.setCapAct(cafe.getCapMax());
        cafe.setCapAct(max);
    }

    public int servirTaza(Cafetera cafe) {
        int actual = cafe.getCapAct();
        System.out.println("Ingrese tamaño de la taza");
        int taza = sc.nextInt();

        if (taza < actual) {

            cafe.setCapAct(actual - taza);
            System.out.println("La taza se lleno por completo");

        } else {

            cafe.setCapAct(actual - taza);
            System.out.println("La taza no se lleno por completo. Se lleno: " + (actual));

        }

        
        return cafe.getCapAct();

    }

    public void vaciarCafetera(Cafetera cafe) {
        cafe.setCapAct(0);
    }

    public int agregarCafe(Cafetera cafe) {
        int actual = cafe.getCapAct();
        System.out.println("Ingrese cantidad de cafe a agregar");
        int agCafe = sc.nextInt();
        cafe.setCapAct(actual + agCafe);
        return cafe.getCapAct();
    }

    public void mostrarCafetera(Cafetera cafe) {
        System.out.println("La capacidad actual es: " + cafe.getCapAct());
        System.out.println("La capacidad maxima es: " + cafe.getCapMax());
    }

}
