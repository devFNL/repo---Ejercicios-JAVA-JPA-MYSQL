/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package difcantdias;

import java.util.Date;

/**
 *
 * @author Jib
 */
public class DifCantDias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Date fechaInicio = new Date(117, 12, 14);
        Date fechaFin = new Date(123, 7, 4);

        int diferencia = (int) (fechaFin.getTime() - fechaInicio.getTime());
        int diff = Math.round(diferencia / (1000 * 60 * 60 * 24));

        System.out.println("La diferencia de dias es: " + diff);

    }

}
