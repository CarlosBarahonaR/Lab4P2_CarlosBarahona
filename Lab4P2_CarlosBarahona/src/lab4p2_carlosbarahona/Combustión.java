/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_carlosbarahona;

import java.awt.Color;

/**
 *
 * @author Admin
 */
public class Combustión extends Automoviles {

    private int consumoCombustible;
    private int duracionAceite;
    private int velocidadMaxima;
    private String tipoCambio;

    public Combustión(int consumoCombustible, int duracionAceite, int velocidadMaxima, String tipoCambio, String modelo, String VIN, String carroceria, int cantidadPasajeros, int capacidadMaletero) {
        super(modelo, VIN, carroceria, cantidadPasajeros, capacidadMaletero);
        this.consumoCombustible = consumoCombustible;
        this.duracionAceite = duracionAceite;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoCambio = tipoCambio;
    }

    public int getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(int consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    public int getDuracionAceite() {
        return duracionAceite;
    }

    public void setDuracionAceite(int duracionAceite) {
        this.duracionAceite = duracionAceite;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) throws Excepcion {
        if (tipoCambio.equalsIgnoreCase("automatico") || tipoCambio.equalsIgnoreCase("manual")) {

            this.tipoCambio = tipoCambio;

        } else {
            throw new Excepcion(Color.red, "El tipo de cambio debe ser entre automatico o manual");
        }
    }

    @Override
    public String toString() {
        return "Combusti\u00f3n{" + "consumoCombustible=" + consumoCombustible + ", duracionAceite=" + duracionAceite + ", velocidadMaxima=" + velocidadMaxima + ", tipoCambio=" + tipoCambio + '}';
    }

    @Override
    public int diasSinFallo() throws Excepcion {

        int a = cantidadPasajeros * consumoCombustible;
        int b = duracionAceite * consumoCombustible;
        int respuesta = 2021 - a - b;
        if (respuesta > 30) {
            return respuesta;
        } else {
            throw new Excepcion(Color.red, "Debe de ser mayor de 30 días sin fallo");

        }
    }

}
