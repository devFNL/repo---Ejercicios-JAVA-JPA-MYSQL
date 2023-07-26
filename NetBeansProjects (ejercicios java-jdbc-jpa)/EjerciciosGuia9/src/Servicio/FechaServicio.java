/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class FechaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Date fechaNacimiento() {

        System.out.println("Ingrese su fecha de nacimiento: (DD/MM/AA)");
        int dd = sc.nextInt();
        int mm = sc.nextInt();
        int aa = sc.nextInt();

        Date fecha = new Date(aa, mm, dd);

        return fecha;
    }

    public Date fechaActual() {

        Date fechaActual = new Date();

        return fechaActual;
    }

    public int diferencia(Date fecha1, Date fecha2) {

        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();

        cal1.setTime(fecha1);
        cal2.setTime(fecha2);

        int a1 = cal1.get(Calendar.YEAR);
        int a2 = cal2.get(Calendar.YEAR);
        int edad = a2 - a1;

        return edad;

    }

}
