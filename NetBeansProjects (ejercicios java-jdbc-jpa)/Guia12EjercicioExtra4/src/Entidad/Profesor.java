/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Jib
 */
public final class Profesor extends Empleado {

    private String departamento;

    public Profesor(String departamento, String tipoEmpleado, int anioIncorporacion, int numDespacho, String nombre, String apellido, int dni, String estadoCivil) {
        super(tipoEmpleado, anioIncorporacion, numDespacho, nombre, apellido, dni, estadoCivil);
        this.departamento = departamento;
    }

    public void cambiarDepartamento() {
        this.departamento = sc.next();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSubClase: Profesor; Departamento: " + departamento;
    }

}
