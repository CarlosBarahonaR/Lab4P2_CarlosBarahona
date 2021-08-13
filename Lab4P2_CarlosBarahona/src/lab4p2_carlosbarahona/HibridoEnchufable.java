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

    public void setCuatroXCuatro(String CuatroXCuatro) throws Excepcion {
        if (CuatroXCuatro.equalsIgnoreCase("si") || CuatroXCuatro.equalsIgnoreCase("no")) {
            this.CuatroXCuatro = CuatroXCuatro;
        } else {
            throw new Excepcion(Color.red, "La respuesta debe ser entre si o no");
        }
    }

    @Override
    public String toString() {
        return "HibridoEnchufable{" + "cantidadKilModoElectrico=" + cantidadKilModoElectrico + ", cantidadMotoresElectricos=" + cantidadMotoresElectricos + ", capacidadRemolque=" + capacidadRemolque + ", CuatroXCuatro=" + CuatroXCuatro + '}';
    }

    @Override
    public int diasSinFallo() throws Excepcion {

        int a = cantidadPasajeros * cantidadMotoresElectricos;
        int b = cantidadKilModoElectrico / capacidadRemolque;
        int c = a + b;
        int respuesta = 2021 - c;
        if (respuesta > 30) {
            return respuesta;
        } else {
            throw new Excepcion(Color.red, "Debe de ser mayor de 30 días sin fallo");

        }
    }

}
