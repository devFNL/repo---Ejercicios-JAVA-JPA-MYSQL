/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12ejercicioextra2;

import Entidad.Edificio;
import Entidad.Oficinas;
import Entidad.Polideportivo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jib
 */
public class Guia12EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Edificio> edificios = new ArrayList();

        Edificio p1 = new Polideportivo("Emanuel David Ginobili", true, 40, 12, 60);
        Edificio p2 = new Polideportivo("Diego Armando Maradona", false, 30, 8, 40);
        Edificio o1 = new Oficinas(12, 5, 12, 15, 30, 40);
        Edificio o2 = new Oficinas(40, 10, 40, 30, 100, 60);

        edificios.add(p1);
        edificios.add(p2);
        edificios.add(o1);
        edificios.add(o2);

//        edificios.add(new Polideportivo("", true, 0, 0, 0));
//        edificios.add(new Polideportivo("", true, 0, 0, 0));
//        edificios.add(new Oficinas(0, 0, 0, 0, 0, 0));
//        edificios.add(new Oficinas(0, 0, 0, 0, 0, 0));
//        for (int i = 0; i < 2; i++) {
//            edificios.add(new Polideportivo("", true, i, i, i));
//        }
//        for (int i = 0; i < 2; i++) {
//            edificios.add(new Oficinas(i, i, i, i, i, i));
//        }
        for (Edificio aux : edificios) {

            System.out.println("Datos de: " + aux.toString());
            System.out.println("La superficie es: " + aux.calcSuperficie(aux.getAncho(), aux.getLargo()));
            System.out.println("El volumen es: " + aux.calcVolumen(aux.getAncho(), aux.getLargo(), aux.getAlto()));

        }

        int techados = 0;
        int abiertos = 0;

        for (Edificio aux : edificios) {
            if (aux instanceof Polideportivo) {
                if (((Polideportivo) aux).isTechado()) {
                    System.out.println("Polideportivo: " + ((Polideportivo) aux).getNombre() + " es techado");
                    techados++;
                } else {
                    System.out.println("Polideportivo: " + ((Polideportivo) aux).getNombre() + " es abierto");
                    abiertos++;
                }
            }
        }

        System.out.println("La cantidad de polideportivos techados es: " + techados);
        System.out.println("La cantidad de polideportivos abiertos es: " + abiertos);

        for (Edificio aux : edificios) {
            if (aux instanceof Oficinas) {
                System.out.println("Edificio: " + aux.toString());
                ((Oficinas) aux).cantPersonas();
            }
        }
    }

}
