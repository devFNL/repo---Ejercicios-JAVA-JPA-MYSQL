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
public class Curso {

    private String nombreCurso;
    private int cantHr;
    private int cantDia;
    private String turno;
    private double precioHr;
    private String[] alumnos;

    public Curso() {
    }

    public Curso(String nombreCurso, int cantHr, int cantDia, String turno, double precioHr, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantHr = cantHr;
        this.cantDia = cantDia;
        this.turno = turno;
        this.precioHr = precioHr;
        this.alumnos = alumnos;
    }

//    @Override
//    public String toString() {
//        return "Curso{" + "alumnos=" + alumnos + '}';
//    }

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void cargarAlumnos() {

        this.alumnos = new String[5];

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno");
            alumnos[i] = sc.next();
        }

    }

//    public void mostrarAlumnos() {
//        
//        for (String alumno : alumnos) {
//            System.out.print(alumno + "");
//        }
//        System.out.println();
//    }    
    
    public void crearCurso() {

        System.out.println("Ingrese el nombre del curso");
        this.nombreCurso = sc.next();
        System.out.println("Ingrese la cantidad de horas por dia");
        this.cantHr = sc.nextInt();
        System.out.println("Ingrese la cantidad de dias por semana");
        this.cantDia = sc.nextInt();
        System.out.println("Ingrese el turno (mañana o tarde)");
        this.turno = sc.next();
        System.out.println("Ingrese el precio por hora");
        this.precioHr = sc.nextDouble();

    }

    public void calcularGananciaSemanal() {
        int cantAlum = 5;
        double ganancia = cantHr * precioHr * cantDia * cantAlum;
        System.out.println("La ganancia es: $" + ganancia);
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantHr() {
        return cantHr;
    }

    public void setCantHr(int cantHr) {
        this.cantHr = cantHr;
    }

    public int getCantDia() {
        return cantDia;
    }

    public void setCantDia(int cantDia) {
        this.cantDia = cantDia;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioHr() {
        return precioHr;
    }

    public void setPrecioHr(double precioHr) {
        this.precioHr = precioHr;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

}
