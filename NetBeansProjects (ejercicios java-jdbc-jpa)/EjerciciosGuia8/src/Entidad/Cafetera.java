/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Jib
 */
public class Cafetera {
    
    public int capMax = 1000;
    public int capAct;

    public Cafetera() {
    }

    public Cafetera(int capAct) {
        this.capAct = capAct;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getCapAct() {
        return capAct;
    }

    public void setCapAct(int capAct) {
        this.capAct = capAct;
    }
    
    
}
