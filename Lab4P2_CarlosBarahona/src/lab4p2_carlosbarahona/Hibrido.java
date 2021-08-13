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
    
    
    
}
