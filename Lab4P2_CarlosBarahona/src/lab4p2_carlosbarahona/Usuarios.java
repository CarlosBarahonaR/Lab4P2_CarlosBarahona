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
public class Usuarios {

    private int usuario;
    private int contraseña;

    public Usuarios(int usuario, int contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }

}
