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
public class HibridoEnchufable extends Automoviles {
    
    private int cantidadKilModoElectrico;
    private int cantidadMotoresElectricos;
    private int capacidadRemolque;
    private String CuatroXCuatro;

    public HibridoEnchufable(int cantidadKilModoElectrico, int cantidadMotoresElectricos, int capacidadRemolque, String CuatroXCuatro, String modelo, String VIN, String carroceria, int cantidadPasajeros, int capacidadMaletero) {
        super(modelo, VIN, carroceria, cantidadPasajeros, capacidadMaletero);
        this.cantidadKilModoElectrico = cantidadKilModoElectrico;
        this.cantidadMotoresElectricos = cantidadMotoresElectricos;
        this.capacidadRemolque = capacidadRemolque;
        this.CuatroXCuatro = CuatroXCuatro;
    }

    public int getCantidadKilModoElectrico() {
        return cantidadKilModoElectrico;
    }

    public void setCantidadKilModoElectrico(int cantidadKilModoElectrico) {
        this.cantidadKilModoElectrico = cantidadKilModoElectrico;
    }

    public int getCantidadMotoresElectricos() {
        return cantidadMotoresElectricos;
    }

    public void setCantidadMotoresElectricos(int cantidadMotoresElectricos) {
        this.cantidadMotoresElectricos = cantidadMotoresElectricos;
    }

    public int getCapacidadRemolque() {
        return capacidadRemolque;
    }

    public void setCapacidadRemolque(int capacidadRemolque) {
        this.capacidadRemolque = capacidadRemolque;
    }

    public String getCuatroXCuatro() {
        return CuatroXCuatro;
    }

    public void setCuatroXCuatro(String CuatroXCuatro) {
        this.CuatroXCuatro = CuatroXCuatro;
    }

    @Override
    public String toString() {
        return "HibridoEnchufable{" + "cantidadKilModoElectrico=" + cantidadKilModoElectrico + ", cantidadMotoresElectricos=" + cantidadMotoresElectricos + ", capacidadRemolque=" + capacidadRemolque + ", CuatroXCuatro=" + CuatroXCuatro + '}';
    }
    
    
    
}
