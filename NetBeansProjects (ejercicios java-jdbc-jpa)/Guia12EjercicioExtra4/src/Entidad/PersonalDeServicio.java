/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Jib
 */
public final class PersonalDeServicio extends Empleado {

    private String seccion;

    public PersonalDeServicio(String seccion, String tipoEmpleado, int anioIncorporacion, int numDespacho, String nombre, String apellido, int dni, String estadoCivil) {
        super(tipoEmpleado, anioIncorporacion, numDespacho, nombre, apellido, dni, estadoCivil);
        this.seccion = seccion;
    }

    public void cambiarSeccion() {
        this.seccion = sc.next();
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSubClase: Personal de Servicio; Sección: " + seccion;
    }

}
