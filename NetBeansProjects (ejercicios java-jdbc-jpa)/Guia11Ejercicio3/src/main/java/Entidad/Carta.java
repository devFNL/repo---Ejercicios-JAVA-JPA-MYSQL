/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Jib
 */
public class Carta {

    private int num;
    private String palo;

    public Carta() {
        this.num = (int) (Math.random() * 12) + 1;

        while (this.num == 8 || this.num == 9) {
            this.num = (int) (Math.random() * 12) + 1;
        }
        String palos[] = {"espada", "basto", "oro", "copa"};
        int numPal = (int) (Math.random() * 4);

        this.palo = palos[numPal];
    }

    public Carta(int num, String palo) {
        this.num = num;
        this.palo = palo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "num=" + num + ", palo=" + palo + '}';
    }

}
