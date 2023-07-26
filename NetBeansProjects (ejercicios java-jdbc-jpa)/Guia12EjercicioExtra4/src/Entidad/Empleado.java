/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Jib
 */
public class Empleado extends Persona {

    protected String tipoEmpleado;
    protected int anioIncorporacion;
    protected int numDespacho;

    public Empleado(String tipoEmpleado, int anioIncorporacion, int numDespacho, String nombre, String apellido, int dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.tipoEmpleado = tipoEmpleado;
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
    }

    public void cambiarDespacho() {
        this.numDespacho = sc.nextInt();
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + "\nClase: Empleado; Tipo de empleado: " + tipoEmpleado + ", Año de incorporación: " + anioIncorporacion + ", N° de despacho: " + numDespacho;
    }

}
