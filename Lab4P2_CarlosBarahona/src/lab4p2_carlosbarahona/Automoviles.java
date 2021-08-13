/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_carlosbarahona;

/**
 *
 * @author Admin
 */
public class Automoviles {
    private String modelo;
    private String VIN;
    private String carroceria;
    private int cantidadPasajeros;
    private int capacidadMaletero;

    public Automoviles(String modelo, String VIN, String carroceria, int cantidadPasajeros, int capacidadMaletero) {
        this.modelo = modelo;
        this.VIN = VIN;
        this.carroceria = carroceria;
        this.cantidadPasajeros = cantidadPasajeros;
        this.capacidadMaletero = capacidadMaletero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    @Override
    public String toString() {
        return "Automoviles{" + "modelo=" + modelo + ", VIN=" + VIN + ", carroceria=" + carroceria + ", cantidadPasajeros=" + cantidadPasajeros + ", capacidadMaletero=" + capacidadMaletero + '}';
    }
    
    
}
