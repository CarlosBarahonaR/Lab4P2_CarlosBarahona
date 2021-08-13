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
public class Hibrido extends Automoviles {

    private int capacidadBateria;
    private int capacidadMotorElectrico;

    public Hibrido(int capacidadBateria, int capacidadMotorElectrico, String modelo, String VIN, String carroceria, int cantidadPasajeros, int capacidadMaletero) {
        super(modelo, VIN, carroceria, cantidadPasajeros, capacidadMaletero);
        this.capacidadBateria = capacidadBateria;
        this.capacidadMotorElectrico = capacidadMotorElectrico;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getCapacidadMotorElectrico() {
        return capacidadMotorElectrico;
    }

    public void setCapacidadMotorElectrico(int capacidadMotorElectrico) {
        this.capacidadMotorElectrico = capacidadMotorElectrico;
    }

    @Override
    public String toString() {
        return "Hibrido{" + "capacidadBateria=" + capacidadBateria + ", capacidadMotorElectrico=" + capacidadMotorElectrico + '}';
    }

    @Override
    public int diasSinFallo() throws Excepcion {

        int a = capacidadBateria * capacidadMaletero;
        int b = a / cantidadPasajeros;
        int respuesta = 2021 - b;
        if (respuesta > 30) {
            return respuesta;
        } else {
            throw new Excepcion(Color.red, "Debe de ser mayor de 30 días sin fallo");

        }
    }

}
