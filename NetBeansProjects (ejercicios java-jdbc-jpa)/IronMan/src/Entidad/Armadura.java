/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Random;

/**
 *
 * @author Jib
 */
public class Armadura {

    private String colorPrimario;
    private String colorSecundario;
    private int nivelResistencia;
    private int nivelSalud;
    private float bateria;
    private Bota bota1;
    private Bota bota2;
    private Guante guante1;
    private Guante guante2;
    private Casco casco;

    Random random = new Random();
    float prob = random.nextFloat();

    public Armadura() {
    }

    public Armadura(String colorPrimario, String colorSecundario, int nivelResistencia, int nivelSalud, float bateria, Bota bota1, Bota bota2, Guante guante1, Guante guante2, Casco casco) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelResistencia = nivelResistencia;
        this.nivelSalud = nivelSalud;
        this.bateria = bateria;
        this.bota1 = bota1;
        this.bota2 = bota2;
        this.guante1 = guante1;
        this.guante2 = guante2;
        this.casco = casco;
    }

    public void caminar(int tiempo) {

        float consumoBota = bota1.getConsumoBota() + bota2.getConsumoBota();

        this.bateria = this.bateria - (consumoBota * tiempo);
    }

    public void correr(int tiempo) {

        float consumoBota = bota1.getConsumoBota() + bota2.getConsumoBota();
        this.bateria = this.bateria - (consumoBota * 2 * tiempo);
    }

    public void propulsar(int tiempo) {
        float consumoBota = bota1.getConsumoBota() + bota2.getConsumoBota();
        this.bateria = this.bateria - (consumoBota * 3 * tiempo);
    }

    public void volar(int tiempo) {
        float consumoBota = bota1.getConsumoBota() + bota2.getConsumoBota();
        float consumoGuante = guante1.getConsumoGuante() + guante2.getConsumoGuante();

        this.bateria = this.bateria - ((consumoBota * 3) + (consumoGuante * 2) * tiempo);

    }

    public void usarGuantes(int tiempo) {
        float consumoGuante = guante1.getConsumoGuante() + guante2.getConsumoGuante();

        this.bateria = this.bateria - (consumoGuante * 3 * tiempo);
    }

    public void escribirConsola() {

        this.bateria = this.bateria - casco.getConsumoCasco();
    }

    public void hablarSintetizador() {

        this.bateria = this.bateria - (casco.getConsumoCasco() * 2);
    }

    public void mostrarEstado() {
        System.out.println("Color primario:  " + this.colorPrimario);
        System.out.println("Color secundario:  " + this.colorSecundario);
        System.out.println("Nivel de resistencia:  " + this.nivelResistencia);
        System.out.println("Nivel de salud:  " + this.nivelSalud);
        mostrarBateria();
        System.out.println("* * Piezas de la armadura * *");
        System.out.println("Bota 1:  " + this.bota1.toString());
        System.out.println("Bota 2:  " + this.bota2.toString());
        System.out.println("Guante 1:  " + this.guante1.toString());
        System.out.println("Guante 2:  " + this.guante2.toString());
        System.out.println("Casco:  " + this.casco.toString());

    }

    public void mostrarBateria() {
        System.out.println("Nivel de bateria:" + ((this.bateria / 100f) * 100) + "%");
    }

    public void escribirEnConsola(String mensaje) {
        escribirConsola();
        System.out.println(mensaje);
    }

    public void sufriendoDanos(Object obj) {
        if (obj instanceof Bota) {
            Bota bota = (Bota) obj;
            if (!bota.isRotoBota()) {
                double random = Math.random();
                if (random <= 0.3) {
                    bota.setRotoBota(true);
                    System.out.println("Las botas han sufrido daños");
                }
            }
        } else if (obj instanceof Guante) {
            Guante guante = (Guante) obj;
            if (!guante.isRotoGuante()) {
                double random = Math.random();
                if (random <= 0.3) {
                    guante.setRotoGuante(true);
                    System.out.println("Los guantes han sufrido daños");
                }
            }
        } else if (obj instanceof Casco) {
            Casco casco = (Casco) obj;
            if (!casco.isCascoRoto()) {
                double random = Math.random();
                if (random <= 0.3) {
                    casco.setCascoRoto(true);
                    System.out.println("El casco ha sufrido daños");
                }
            }
        }
    }

    public void revisarDispositivos() {

        if (prob <= 0.4) {
            if (bota1.isRotoBota()) {
                bota1.setRotoBota(false);
            }
            if (bota2.isRotoBota()) {
                bota2.setRotoBota(false);
            }
            if (guante1.isRotoGuante()) {
                guante1.setRotoGuante(false);
            }
            if (guante2.isRotoGuante()) {
                guante2.setRotoGuante(false);
            }
            if (casco.isCascoRoto()) {
                casco.setCascoRoto(false);
            }

            System.out.println("Los dispositivos dañados han sido reparados");
        } else {
            System.out.println("No fue posible reparar los dispositivos dañados");
        }
    }

    public void repararDanos(Object obj) {

        if (obj instanceof Bota) {
            Bota bota = (Bota) obj;
            if (bota.isRotoBota() && prob <= 0.4) {
                bota.setRotoBota(false);
                System.out.println("La bota ha sido reparada exitosamente");
            } else {
                System.out.println("No fue posible reparar la bota");
            }
        } else if (obj instanceof Guante) {
            Guante guante = (Guante) obj;
            if (guante.isRotoGuante() && prob <= 0.4) {
                guante.setRotoGuante(false);
                System.out.println("El guante ha sido reparado exitosamente");
            } else {
                System.out.println("No fue posible reparar el guante");
            }
        } else if (obj instanceof Casco) {
            Casco casco = (Casco) obj;
            if (casco.isCascoRoto() && prob <= 0.4) {
                casco.setCascoRoto(false);
                System.out.println("El casco ha sido reparado exitosamente");
            } else {
                System.out.println("No fue posible reparar el casco");
            }
        } else {
            System.out.println("Objeto no válido para reparación");
        }
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public int getNivelResistencia() {
        return nivelResistencia;
    }

    public void setNivelResistencia(int nivelResistencia) {
        this.nivelResistencia = nivelResistencia;
    }

    public int getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(int nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public float getBateria() {
        return bateria;
    }

    public void setBateria(float bateria) {
        this.bateria = bateria;
    }

    public Bota getBota1() {
        return bota1;
    }

    public void setBota1(Bota bota1) {
        this.bota1 = bota1;
    }

    public Bota getBota2() {
        return bota2;
    }

    public void setBota2(Bota bota2) {
        this.bota2 = bota2;
    }

    public Guante getGuante1() {
        return guante1;
    }

    public void setGuante1(Guante guante1) {
        this.guante1 = guante1;
    }

    public Guante getGuante2() {
        return guante2;
    }

    public void setGuante2(Guante guante2) {
        this.guante2 = guante2;
    }

    public Casco getCasco() {
        return casco;
    }

    public void setCasco(Casco casco) {
        this.casco = casco;
    }

    @Override
    public String toString() {
        return "Armadura{" + "colorPrimario=" + colorPrimario + ", colorSecundario=" + colorSecundario + ", nivelResistencia=" + nivelResistencia + ", nivelSalud=" + nivelSalud + ", bateria=" + bateria + ", bota1=" + bota1 + ", bota2=" + bota2 + ", guante1=" + guante1 + ", guante2=" + guante2 + ", casco=" + casco + '}';
    }

}
