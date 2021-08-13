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
public class Electrico extends Automoviles {

    private int cantidadKMRecorrer;
    private int cantidadBateriasAlmacena;
    private int aceleracion;
    private int tiempoCargaCompleta;

    public Electrico(int cantidadKMRecorrer, int cantidadBateriasAlmacena, int aceleracion, int tiempoCargaCompleta, String modelo, String VIN, String carroceria, int cantidadPasajeros, int capacidadMaletero) {
        super(modelo, VIN, carroceria, cantidadPasajeros, capacidadMaletero);
        this.cantidadKMRecorrer = cantidadKMRecorrer;
        this.cantidadBateriasAlmacena = cantidadBateriasAlmacena;
        this.aceleracion = aceleracion;
        this.tiempoCargaCompleta = tiempoCargaCompleta;
    }

    public int getCantidadKMRecorrer() {
        return cantidadKMRecorrer;
    }

    public void setCantidadKMRecorrer(int cantidadKMRecorrer) {
        this.cantidadKMRecorrer = cantidadKMRecorrer;
    }

    public int getCantidadBateriasAlmacena() {
        return cantidadBateriasAlmacena;
    }

    public void setCantidadBateriasAlmacena(int cantidadBateriasAlmacena) {
        this.cantidadBateriasAlmacena = cantidadBateriasAlmacena;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) throws Excepcion {
        if (aceleracion > 0 && aceleracion < 100) {
            this.aceleracion = aceleracion;

        } else {
            throw new Excepcion(Color.red, "La aceleración no puede ser menor de 0 ni mayor que 100");
        }
    }

    public int getTiempoCargaCompleta() {
        return tiempoCargaCompleta;
    }

    public void setTiempoCargaCompleta(int tiempoCargaCompleta) {
        this.tiempoCargaCompleta = tiempoCargaCompleta;
    }

    @Override
    public String toString() {
        return "Electrico{" + "cantidadKMRecorrer=" + cantidadKMRecorrer + ", cantidadBateriasAlmacena=" + cantidadBateriasAlmacena + ", aceleracion=" + aceleracion + ", tiempoCargaCompleta=" + tiempoCargaCompleta + '}';
    }

    @Override
    public int diasSinFallo() throws Excepcion {

        int a = tiempoCargaCompleta * cantidadPasajeros;
        int b = a / aceleracion;
        int c = b + cantidadBateriasAlmacena;
        int respuesta = 2021 - c;
        if (respuesta > 30) {
            return respuesta;
        } else {
            throw new Excepcion(Color.red, "Debe de ser mayor de 30 días sin fallo");

        }

    }

}
