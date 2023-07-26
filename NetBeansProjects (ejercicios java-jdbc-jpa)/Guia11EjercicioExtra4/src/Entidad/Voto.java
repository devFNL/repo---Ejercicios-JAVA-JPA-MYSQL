/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.List;

/**
 *
 * @author Jib
 */
public class Voto {

    private Alumno alumno;
    private List<Alumno> votados;

    public Voto() {
    }

    public Voto(Alumno alumno, List<Alumno> votados) {
        this.alumno = alumno;
        this.votados = votados;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Alumno> getVotados() {
        return votados;
    }

    public void setVotados(List<Alumno> votados) {
        this.votados = votados;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumno=" + alumno + ", votados=" + votados + '}';
    }

}
