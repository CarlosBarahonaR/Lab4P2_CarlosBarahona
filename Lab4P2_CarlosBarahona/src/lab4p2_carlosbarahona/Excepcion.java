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
public class Excepcion extends Exception {
    private Color color;

    public Excepcion() {
        super();
    }

    public Excepcion(Color color, String message) {
        super(message);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Excepcion{" + "color=" + color + '}';
    }
    
    
    
}
