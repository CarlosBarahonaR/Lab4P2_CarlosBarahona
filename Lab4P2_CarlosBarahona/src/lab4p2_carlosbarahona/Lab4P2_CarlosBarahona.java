/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_carlosbarahona;

import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab4P2_CarlosBarahona {

    /**
     * @param args the command line arguments
     * @throws lab4p2_carlosbarahona.Excepcion
     */
    public static void main(String[] args) throws Excepcion {
        // TODO code application logic here
        Scanner r = new Scanner(System.in);

        ArrayList usuarios = new ArrayList();
        ArrayList VIN = new ArrayList();
        ArrayList automoviles = new ArrayList();
        ArrayList<Combustión> combustion = new ArrayList();
        ArrayList<Electrico> electrico = new ArrayList();
        ArrayList<Hibrido> hibrido = new ArrayList();
        ArrayList<HibridoEnchufable> hibridoEnchufable = new ArrayList();

        int opcion = 0;
        while (opcion != 3) {
            System.out.println("Bienvenido a Toyota\n"
                    + "¿Qué desea hacer?\n"
                    + "1) Iniciar sesión\n"
                    + "2) Registrarse\n"
                    + "3) Salir");
            opcion = r.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese su nombre de usuario");
                    String usuario = r.next();
                    System.out.println("Ingrese su contraseña");
                    String contraseña = r.next();
                    int item = 0;

                    boolean correcto = false;
                    for (int i = 0; i < usuarios.size(); i++) {

                        if (usuarios.get(i) instanceof Usuarios) {
                            String usuario2 = ((Usuarios) usuarios.get(i)).getUsuario();

                            String contraseña2 = ((Usuarios) usuarios.get(i)).getContraseña();
                            if (usuario.equals(usuario2) && contraseña.equals(contraseña2)) {
                                correcto = true;
                                item = i;
                            } else {
                                item = 1000;
                                correcto = false;
                            }
                        }
                    }

                    if (item <= usuarios.size()) {
                        if (usuarios.get(item) instanceof Usuarios && correcto == true) {
                            System.out.println("¿Con cual desea hacer CRUD?\n"
                                    + "1) Combustión\n"
                                    + "2) Hibrido\n"
                                    + "3) Hibrido enchufable\n"
                                    + "4) Electrico\n"
                                    + "5) Salir");
                            int opcion2 = r.nextInt();
                            while (opcion2 != 5) {
                                switch (opcion2) {
                                    case 1: {
                                        System.out.println("¿Que desea hacer?\n"
                                                + "1) Agregar combustion\n"
                                                + "2) Modificar combustion\n"
                                                + "3) Eliminar combustion\n"
                                                + "4) Listar combustion\n"
                                                + "5) Calcular días sin fallos");
                                        int op = r.nextInt();
                                        while (op != 6) {
                                            switch (op) {
                                                case 1: {
                                                    System.out.println("Ingrese el modelo del Automovil de combustion");
                                                    String modelo = r.next();
                                                    boolean usado = false;
                                                    String VIN2 = "";
                                                    while (usado) {
                                                        System.out.println("Ingrese el VIN del Automovil de combustion");
                                                        VIN2 = r.next();

                                                        for (int x = 0; x < VIN.size(); x++) {
                                                            if (VIN.get(x).equals(VIN2)) {
                                                                usado = true;
                                                            } else {
                                                                usado = false;
                                                            }

                                                        }

                                                    }

                                                    System.out.println("Ingrese la carrocería del Automovil de combustion");
                                                    String carroceria = r.next();
                                                    System.out.println("Ingrese la cantidad de pasajeros del Automovil de combustion");
                                                    int cantidadPasajeros = r.nextInt();
                                                    System.out.println("Ingrese la capacidad del maletero del Automovil de combustion");
                                                    int capacidadMaletero = r.nextInt();
                                                    System.out.println("Ingrese el consumo de combustible (en kilometro por litro) del Automovil de combustion");
                                                    int consumoCombustible = r.nextInt();
                                                    System.out.println("Ingrese la duración del aceite (en meses) del Automovil de combustion");
                                                    int duraciónAceite = r.nextInt();
                                                    System.out.println("Ingrese la velocidad maxima del Automovil de combustion");
                                                    int velocidadMaxima = r.nextInt();
                                                    System.out.println("Ingrese el tipo de cambio (manual o automatico) del Automovil de combustion");
                                                    String tipoCambio = r.next();
                                                    automoviles.add(new Combustión(consumoCombustible, duraciónAceite, velocidadMaxima, tipoCambio, modelo, VIN2, carroceria, cantidadPasajeros, capacidadMaletero));
                                                    break;
                                                }
                                                case 2: {
                                                    System.out.println("Ingrese el VIN del automovil combustion para buscarlo");
                                                    String VIN4 = r.next();
                                                    int item2 = 0;
                                                    for (int x = 0; x < automoviles.size(); x++) {
                                                        String VIN3 = "";
                                                        if (automoviles.get(x) instanceof Combustión) {
                                                            VIN3 = ((Combustión) automoviles.get(x)).getVIN();
                                                        }
                                                        if (VIN3.equalsIgnoreCase(VIN4)) {
                                                            item2 = x;
                                                            x = automoviles.size();
                                                        } else {
                                                            item2 = 1000;
                                                        }
                                                    }
                                                    if (item2 <= automoviles.size()) {
                                                        if (automoviles.get(item) instanceof Combustión) {
                                                            System.out.println("¿Que desea modificar?\n"
                                                                    + "1) Modelo\n"
                                                                    + "2) VIN\n"
                                                                    + "3) Carroceria\n"
                                                                    + "4) Cantidad Pasajeros\n"
                                                                    + "5) Capacidad maletero\n"
                                                                    + "6) Consumo combustible\n"
                                                                    + "7) Duracion del aceite\n"
                                                                    + "8) Velocidad maxima\n"
                                                                    + "9) Tipo cambio");
                                                            int variable = r.nextInt();
                                                            switch (variable) {
                                                                case 1: {
                                                                    ((Combustión) usuarios.get(item)).setModelo(r.next());
                                                                    break;
                                                                }
                                                                case 2: {
                                                                    ((Combustión) usuarios.get(item)).setVIN(r.next());
                                                                    break;
                                                                }
                                                                case 3: {
                                                                    ((Combustión) usuarios.get(item)).setCarroceria(r.next());
                                                                    break;
                                                                }
                                                                case 4: {
                                                                    ((Combustión) usuarios.get(item)).setCantidadPasajeros(r.nextInt());
                                                                    break;
                                                                }
                                                                case 5: {
                                                                    ((Combustión) usuarios.get(item)).setCapacidadMaletero(r.nextInt());
                                                                    break;
                                                                }
                                                                case 6: {
                                                                    ((Combustión) usuarios.get(item)).setConsumoCombustible(r.nextInt());
                                                                    break;
                                                                }
                                                                case 7: {
                                                                    ((Combustión) usuarios.get(item)).setDuracionAceite(r.nextInt());
                                                                    break;
                                                                }
                                                                case 8: {
                                                                    ((Combustión) usuarios.get(item)).setVelocidadMaxima(r.nextInt());
                                                                    break;
                                                                }
                                                                case 9: {
                                                                    ((Combustión) usuarios.get(item)).setTipoCambio(r.next());
                                                                    break;
                                                                }

                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("No se encontro el VIN del automovil de combustion en la lista. Consulte con el soporte tecnico de la compañia.");
                                                    }
                                                    break;
                                                }
                                                case 3: {
                                                    System.out.println("Ingrese el VIN del automovil combustion para eliminarlo");
                                                    String VIN4 = r.next();
                                                    int item2 = 0;
                                                    for (int x = 0; x < automoviles.size(); x++) {
                                                        String VIN3 = "";
                                                        if (automoviles.get(x) instanceof Combustión) {
                                                            VIN3 = ((Combustión) automoviles.get(x)).getVIN();
                                                        }
                                                        if (VIN3.equalsIgnoreCase(VIN4)) {
                                                            item2 = x;
                                                            x = automoviles.size();
                                                        } else {
                                                            item2 = 1000;
                                                        }
                                                    }
                                                    if (item2 <= automoviles.size()) {
                                                        automoviles.remove(item2);
                                                    } else {
                                                        System.out.println("No se encontro el VIN del automovil de combustion en la lista. Consulte con el soporte tecnico de la compañia.");
                                                    }
                                                    break;
                                                }
                                                case 4: {
                                                    for (int z = 0; z < automoviles.size(); z++) {
                                                        if (automoviles.get(z) instanceof Combustión) {
                                                            System.out.println(automoviles.get(z));

                                                        }
                                                    }
                                                    break;
                                                }
                                                case 5: {
                                                    System.out.println("Ingrese el VIN del automovil combustion para calcular los días sin fallo");
                                                    String VIN4 = r.next();
                                                    int item2 = 0;
                                                    for (int x = 0; x < automoviles.size(); x++) {
                                                        String VIN3 = "";
                                                        if (automoviles.get(x) instanceof Combustión) {
                                                            VIN3 = ((Combustión) automoviles.get(x)).getVIN();
                                                        }
                                                        if (VIN3.equalsIgnoreCase(VIN4)) {
                                                            item2 = x;
                                                            x = automoviles.size();
                                                        } else {
                                                            item2 = 1000;
                                                        }
                                                        if (item2 <= automoviles.size()) {
                                                            System.out.println("Dias sin fallo " + ((Combustión) usuarios.get(item2)).diasSinFallo());
                                                        } else {
                                                            System.out.println("No se encontro el VIN del automovil de combustion en la lista. Consulte con el soporte tecnico de la compañia.");
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("¿Que desea hacer?\n"
                                                + "1) Agregar hibrido\n"
                                                + "2) Modificar hibrido\n"
                                                + "3) Eliminar hibrido\n"
                                                + "4) Listar hibrido\n"
                                                + "5) Calcular días sin fallos");
                                        int op = r.nextInt();
                                        while (op != 6) {
                                            switch (op) {
                                                case 1: {
                                                    System.out.println("Ingrese el modelo del Automovil de hibrido");
                                                    String modelo = r.next();
                                                    boolean usado = false;
                                                    String VIN2 = "";
                                                    while (usado) {
                                                        System.out.println("Ingrese el VIN del Automovil de hibrido");
                                                        VIN2 = r.next();

                                                        for (int x = 0; x < VIN.size(); x++) {
                                                            if (VIN.get(x).equals(VIN2)) {
                                                                usado = true;
                                                            } else {
                                                                usado = false;
                                                            }

                                                        }

                                                    }

                                                    System.out.println("Ingrese la carrocería del Automovil de hibrido");
                                                    String carroceria = r.next();
                                                    System.out.println("Ingrese la cantidad de pasajeros del Automovil de hibrido");
                                                    int cantidadPasajeros = r.nextInt();
                                                    System.out.println("Ingrese la capacidad del maletero del Automovil de hibrido");
                                                    int capacidadMaletero = r.nextInt();
                                                    System.out.println("Ingrese la capacidad de la batería(en kilowatt por hora) del Automovil de hibrido");
                                                    int capacidadBatería = r.nextInt();
                                                    System.out.println("Ingrese la capacidad del motor eléctrico (en kilowatt) del Automovil de hibrido");
                                                    int capacidadMotorElectrico = r.nextInt();

                                                    automoviles.add(new Hibrido(capacidadBatería, capacidadMotorElectrico, modelo, VIN2, carroceria, cantidadPasajeros, capacidadMaletero));
                                                    break;
                                                }
                                                case 2: {
                                                    System.out.println("Ingrese el VIN del automovil hibrido para buscarlo");
                                                    String VIN4 = r.next();
                                                    int item2 = 0;
                                                    for (int x = 0; x < automoviles.size(); x++) {
                                                        String VIN3 = "";
                                                        if (automoviles.get(x) instanceof Hibrido) {
                                                            VIN3 = ((Hibrido) automoviles.get(x)).getVIN();
                                                        }
                                                        if (VIN3.equalsIgnoreCase(VIN4)) {
                                                            item2 = x;
                                                            x = automoviles.size();
                                                        } else {
                                                            item2 = 1000;
                                                        }
                                                    }
                                                    if (item2 <= automoviles.size()) {
                                                        if (automoviles.get(item) instanceof Hibrido) {
                                                            System.out.println("¿Que desea modificar?\n"
                                                                    + "1) Modelo\n"
                                                                    + "2) VIN\n"
                                                                    + "3) Carroceria\n"
                                                                    + "4) Cantidad Pasajeros\n"
                                                                    + "5) Capacidad maletero\n"
                                                                    + "6) Capacidad Batería\n"
                                                                    + "7) Capacidad motor electrico");
                                                            int variable = r.nextInt();
                                                            switch (variable) {
                                                                case 1: {
                                                                    ((Hibrido) usuarios.get(item)).setModelo(r.next());
                                                                    break;
                                                                }
                                                                case 2: {
                                                                    ((Hibrido) usuarios.get(item)).setVIN(r.next());
                                                                    break;
                                                                }
                                                                case 3: {
                                                                    ((Hibrido) usuarios.get(item)).setCarroceria(r.next());
                                                                    break;
                                                                }
                                                                case 4: {
                                                                    ((Hibrido) usuarios.get(item)).setCantidadPasajeros(r.nextInt());
                                                                    break;
                                                                }
                                                                case 5: {
                                                                    ((Hibrido) usuarios.get(item)).setCapacidadMaletero(r.nextInt());
                                                                    break;
                                                                }
                                                                case 6: {
                                                                    ((Hibrido) usuarios.get(item)).setCapacidadBateria(r.nextInt());
                                                                    break;
                                                                }
                                                                case 7: {
                                                                    ((Hibrido) usuarios.get(item)).setCapacidadMotorElectrico(r.nextInt());
                                                                    break;
                                                                }

                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("No se encontro el VIN del automovil hibrido en la lista. Consulte con el soporte tecnico de la compañia.");
                                                    }
                                                    break;
                                                }
                                                case 3: {
                                                    System.out.println("Ingrese el VIN del automovil hibrido para eliminarlo");
                                                    String VIN4 = r.next();
                                                    int item2 = 0;
                                                    for (int x = 0; x < automoviles.size(); x++) {
                                                        String VIN3 = "";
                                                        if (automoviles.get(x) instanceof Hibrido) {
                                                            VIN3 = ((Hibrido) automoviles.get(x)).getVIN();
                                                        }
                                                        if (VIN3.equalsIgnoreCase(VIN4)) {
                                                            item2 = x;
                                                            x = automoviles.size();
                                                        } else {
                                                            item2 = 1000;
                                                        }
                                                    }
                                                    if (item2 <= automoviles.size()) {
                                                        automoviles.remove(item2);
                                                    } else {
                                                        System.out.println("No se encontro el VIN del automovil hibrido en la lista. Consulte con el soporte tecnico de la compañia.");
                                                    }
                                                    break;
                                                }
                                                case 4: {
                                                    for (int z = 0; z < automoviles.size(); z++) {
                                                        if (automoviles.get(z) instanceof Hibrido) {
                                                            System.out.println(automoviles.get(z));

                                                        }
                                                    }
                                                    break;
                                                }
                                                case 5: {
                                                    System.out.println("Ingrese el VIN del automovil hibrido para calcular los días sin fallo");
                                                    String VIN4 = r.next();
                                                    int item2 = 0;
                                                    for (int x = 0; x < automoviles.size(); x++) {
                                                        String VIN3 = "";
                                                        if (automoviles.get(x) instanceof Hibrido) {
                                                            VIN3 = ((Hibrido) automoviles.get(x)).getVIN();
                                                        }
                                                        if (VIN3.equalsIgnoreCase(VIN4)) {
                                                            item2 = x;
                                                            x = automoviles.size();
                                                        } else {
                                                            item2 = 1000;
                                                        }
                                                        if (item2 <= automoviles.size()) {
                                                            System.out.println("Dias sin fallo " + ((Hibrido) usuarios.get(item2)).diasSinFallo());
                                                        } else {
                                                            System.out.println("No se encontro el VIN del automovil de combustion en la lista. Consulte con el soporte tecnico de la compañia.");
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    }

                                    case 3: {
                                        System.out.println("¿Que desea hacer?\n"
                                                + "1) Agregar hibrido enchufable\n"
                                                + "2) Modificar hibrido enchufable\n"
                                                + "3) Eliminar hibrido enchufable\n"
                                                + "4) Listar hibrido enchufable\n"
                                                + "5) Calcular días sin fallos");
                                        int op = r.nextInt();
                                        while (op != 6) {
                                            switch (op) {
                                                case 1: {
                                                    System.out.println("Ingrese el modelo del Automovil de hibrido enchufable");
                                                    String modelo = r.next();
                                                    boolean usado = false;
                                                    String VIN2 = "";
                                                    while (usado) {
                                                        System.out.println("Ingrese el VIN del Automovil de hibrido enchufable");
                                                        VIN2 = r.next();

                                                        for (int x = 0; x < VIN.size(); x++) {
                                                            if (VIN.get(x).equals(VIN2)) {
                                                                usado = true;
                                                            } else {
                                                                usado = false;
                                                            }

                                                        }

                                                    }

                                                    System.out.println("Ingrese la carrocería del Automovil de hibrido enchufable");
                                                    String carroceria = r.next();
                                                    System.out.println("Ingrese la cantidad de pasajeros del Automovil de hibrido enchufable");
                                                    int cantidadPasajeros = r.nextInt();
                                                    System.out.println("Ingrese la capacidad del maletero del Automovil de hibrido enchufable");
                                                    int capacidadMaletero = r.nextInt();
                                                    System.out.println("Ingrese la cantidad de kilometros en modo electrico del Automovil de hibrido enchufable");
                                                    int cantidadKMModoElectrico = r.nextInt();
                                                    System.out.println("Ingrese la cantidad de motores electricos del Automovil de hibrido enchufable");
                                                    int cantidadMotoresElectricos = r.nextInt();
                                                    System.out.println("Ingrese la capacidad del remolque(en toneladas) del Automovil de hibrido enchufable");
                                                    int cantidadRemolque = r.nextInt();
                                                    System.out.println("Ingrese si Automovil de hibrido enchufable es 4x4(Si o no)");
                                                    String CuatroXCuatro = r.next();
                                                    automoviles.add(new HibridoEnchufable(cantidadKMModoElectrico, cantidadMotoresElectricos, cantidadRemolque, CuatroXCuatro, modelo, VIN2, carroceria, cantidadPasajeros, capacidadMaletero));
                                                    break;
                                                }
                                                case 2: {
                                                    System.out.println("Ingrese el VIN del automovil hibrido enchufable para buscarlo");
                                                    String VIN4 = r.next();
                                                    int item2 = 0;
                                                    for (int x = 0; x < automoviles.size(); x++) {
                                                        String VIN3 = "";
                                                        if (automoviles.get(x) instanceof HibridoEnchufable) {
                                                            VIN3 = ((HibridoEnchufable) automoviles.get(x)).getVIN();
                                                        }
                                                        if (VIN3.equalsIgnoreCase(VIN4)) {
                                                            item2 = x;
                                                            x = automoviles.size();
                                                        } else {
                                                            item2 = 1000;
                                                        }
                                                    }
                                                    if (item2 <= automoviles.size()) {
                                                        if (automoviles.get(item) instanceof HibridoEnchufable) {
                                                            System.out.println("¿Que desea modificar?\n"
                                                                    + "1) Modelo\n"
                                                                    + "2) VIN\n"
                                                                    + "3) Carroceria\n"
                                                                    + "4) Cantidad Pasajeros\n"
                                                                    + "5) Capacidad maletero\n"
                                                                    + "6) Cantidad de kilometros en modo electrico\n"
                                                                    + "7) Cantidad de motores electricos\n"
                                                                    + "8) Capacidad remolque\n"
                                                                    + "9) 4X4(Si o no)");
                                                            int variable = r.nextInt();
                                                            switch (variable) {
                                                                case 1: {
                                                                    ((HibridoEnchufable) usuarios.get(item)).setModelo(r.next());
                                                                    break;
                                                                }
                                                                case 2: {
                                                                    ((HibridoEnchufable) usuarios.get(item)).setVIN(r.next());
                                                                    break;
                                                                }
                                                                case 3: {
                                                                    ((HibridoEnchufable) usuarios.get(item)).setCarroceria(r.next());
                                                                    break;
                                                                }
                                                                case 4: {
                                                                    ((HibridoEnchufable) usuarios.get(item)).setCantidadPasajeros(r.nextInt());
                                                                    break;
                                                                }
                                                                case 5: {
                                                                    ((HibridoEnchufable) usuarios.get(item)).setCapacidadMaletero(r.nextInt());
                                                                    break;
                                                                }
                                                                case 6: {
                                                                    ((HibridoEnchufable) usuarios.get(item)).setCantidadKilModoElectrico(r.nextInt());
                                                                    break;
                                                                }
                                                                case 7: {
                                                                    ((HibridoEnchufable) usuarios.get(item)).setCantidadMotoresElectricos(r.nextInt());
                                                                    break;
                                                                }
                                                                case 8: {
                                                                    ((HibridoEnchufable) usuarios.get(item)).setCapacidadRemolque(r.nextInt());
                                                                    break;
                                                                }
                                                                case 9: {
                                                                    ((HibridoEnchufable) usuarios.get(item)).setCuatroXCuatro(r.next());
                                                                    break;
                                                                }

                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("No se encontro el VIN del automovil hibrido enchufable en la lista. Consulte con el soporte tecnico de la compañia.");
                                                    }
                                                    break;
                                                }
                                                case 3: {
                                                    System.out.println("Ingrese el VIN del automovil hibrido enchufable para eliminarlo");
                                                    String VIN4 = r.next();
                                                    int item2 = 0;
                                                    for (int x = 0; x < automoviles.size(); x++) {
                                                        String VIN3 = "";
                                                        if (automoviles.get(x) instanceof HibridoEnchufable) {
                                                            VIN3 = ((HibridoEnchufable) automoviles.get(x)).getVIN();
                                                        }
                                                        if (VIN3.equalsIgnoreCase(VIN4)) {
                                                            item2 = x;
                                                            x = automoviles.size();
                                                        } else {
                                                            item2 = 1000;
                                                        }
                                                    }
                                                    if (item2 <= automoviles.size()) {
                                                        automoviles.remove(item2);
                                                    } else {
                                                        System.out.println("No se encontro el VIN del automovil hibrido enchufable en la lista. Consulte con el soporte tecnico de la compañia.");
                                                    }
                                                    break;
                                                }
                                                case 4: {
                                                    for (int z = 0; z < automoviles.size(); z++) {
                                                        if (automoviles.get(z) instanceof HibridoEnchufable) {
                                                            System.out.println(automoviles.get(z));

                                                        }
                                                    }
                                                    break;
                                                }
                                                case 5: {
                                                    System.out.println("Ingrese el VIN del automovil hibrido enchufable para calcular los días sin fallo");
                                                    String VIN4 = r.next();
                                                    int item2 = 0;
                                                    for (int x = 0; x < automoviles.size(); x++) {
                                                        String VIN3 = "";
                                                        if (automoviles.get(x) instanceof HibridoEnchufable) {
                                                            VIN3 = ((HibridoEnchufable) automoviles.get(x)).getVIN();
                                                        }
                                                        if (VIN3.equalsIgnoreCase(VIN4)) {
                                                            item2 = x;
                                                            x = automoviles.size();
                                                        } else {
                                                            item2 = 1000;
                                                        }
                                                        if (item2 <= automoviles.size()) {
                                                            System.out.println("Dias sin fallo " + ((HibridoEnchufable) usuarios.get(item2)).diasSinFallo());
                                                        } else {
                                                            System.out.println("No se encontro el VIN del automovil hibrido enchufable en la lista. Consulte con el soporte tecnico de la compañia.");
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    }

                                    case 4: {
                                        System.out.println("¿Que desea hacer?\n"
                                                + "1) Agregar electrico\n"
                                                + "2) Modificar electrico\n"
                                                + "3) Eliminar electrico\n"
                                                + "4) Listar electrico\n"
                                                + "5) Calcular días sin fallos");
                                        int op = r.nextInt();
                                        while (op != 6) {
                                            switch (op) {
                                                case 1: {
                                                    System.out.println("Ingrese el modelo del Automovil de electrico");
                                                    String modelo = r.next();
                                                    boolean usado = false;
                                                    String VIN2 = "";
                                                    while (usado) {
                                                        System.out.println("Ingrese el VIN del Automovil de electrico");
                                                        VIN2 = r.next();

                                                        for (int x = 0; x < VIN.size(); x++) {
                                                            if (VIN.get(x).equals(VIN2)) {
                                                                usado = true;
                                                            } else {
                                                                usado = false;
                                                            }

                                                        }

                                                    }

                                                    System.out.println("Ingrese la carrocería del Automovil de electrico");
                                                    String carroceria = r.next();
                                                    System.out.println("Ingrese la cantidad de pasajeros del Automovil de electrico");
                                                    int cantidadPasajeros = r.nextInt();
                                                    System.out.println("Ingrese la capacidad del maletero del Automovil de electrico");
                                                    int capacidadMaletero = r.nextInt();
                                                    System.out.println("Ingrese la cantidad de kilometros que puede recorrer el Automovil de electrico");
                                                    int cantidadKMRecorrer = r.nextInt();
                                                    System.out.println("Ingrese la cantidad de baterías que almacena el Automovil de electrico");
                                                    int cantidadBateriasAlmacena = r.nextInt();
                                                    System.out.println("Ingrese la aceleración del Automovil de electrico");
                                                    int aceleracion = r.nextInt();
                                                    System.out.println("Ingrese el tiempo que dura una carga completa (en minutos) del Automovil de electrico ");
                                                    int tiempoCargaCompleta = r.nextInt();
                                                    automoviles.add(new Electrico(cantidadKMRecorrer, cantidadBateriasAlmacena, aceleracion, tiempoCargaCompleta, modelo, VIN2, carroceria, cantidadPasajeros, capacidadMaletero));
                                                    break;
                                                }
                                                case 2: {
                                                    System.out.println("Ingrese el VIN del automovil electrico para buscarlo");
                                                    String VIN4 = r.next();
                                                    int item2 = 0;
                                                    for (int x = 0; x < automoviles.size(); x++) {
                                                        String VIN3 = "";
                                                        if (automoviles.get(x) instanceof Electrico) {
                                                            VIN3 = ((Electrico) automoviles.get(x)).getVIN();
                                                        }
                                                        if (VIN3.equalsIgnoreCase(VIN4)) {
                                                            item2 = x;
                                                            x = automoviles.size();
                                                        } else {
                                                            item2 = 1000;
                                                        }
                                                    }
                                                    if (item2 <= automoviles.size()) {
                                                        if (automoviles.get(item) instanceof Electrico) {
                                                            System.out.println("¿Que desea modificar?\n"
                                                                    + "1) Modelo\n"
                                                                    + "2) VIN\n"
                                                                    + "3) Carroceria\n"
                                                                    + "4) Cantidad Pasajeros\n"
                                                                    + "5) Capacidad maletero\n"
                                                                    + "6) Cantidad de kilometros que puede recorrer\n"
                                                                    + "7) Cantidad de baterías que almacena\n"
                                                                    + "8) Aceleración\n"
                                                                    + "9) Tiempo que dura una carga completa");
                                                            int variable = r.nextInt();
                                                            switch (variable) {
                                                                case 1: {
                                                                    ((Electrico) usuarios.get(item)).setModelo(r.next());
                                                                    break;
                                                                }
                                                                case 2: {
                                                                    ((Electrico) usuarios.get(item)).setVIN(r.next());
                                                                    break;
                                                                }
                                                                case 3: {
                                                                    ((Electrico) usuarios.get(item)).setCarroceria(r.next());
                                                                    break;
                                                                }
                                                                case 4: {
                                                                    ((Electrico) usuarios.get(item)).setCantidadPasajeros(r.nextInt());
                                                                    break;
                                                                }
                                                                case 5: {
                                                                    ((Electrico) usuarios.get(item)).setCapacidadMaletero(r.nextInt());
                                                                    break;
                                                                }
                                                                case 6: {
                                                                    ((Electrico) usuarios.get(item)).setCantidadKMRecorrer(r.nextInt());
                                                                    break;
                                                                }
                                                                case 7: {
                                                                    ((Electrico) usuarios.get(item)).setCantidadBateriasAlmacena(r.nextInt());
                                                                    break;
                                                                }
                                                                case 8: {
                                                                    ((Electrico) usuarios.get(item)).setAceleracion(r.nextInt());
                                                                    break;
                                                                }
                                                                case 9: {
                                                                    ((Electrico) usuarios.get(item)).setTiempoCargaCompleta(r.nextInt());
                                                                    break;
                                                                }

                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("No se encontro el VIN del automovil electrico en la lista. Consulte con el soporte tecnico de la compañia.");
                                                    }
                                                    break;
                                                }
                                                case 3: {
                                                    System.out.println("Ingrese el VIN del automovil electrico para eliminarlo");
                                                    String VIN4 = r.next();
                                                    int item2 = 0;
                                                    for (int x = 0; x < automoviles.size(); x++) {
                                                        String VIN3 = "";
                                                        if (automoviles.get(x) instanceof Electrico) {
                                                            VIN3 = ((Electrico) automoviles.get(x)).getVIN();
                                                        }
                                                        if (VIN3.equalsIgnoreCase(VIN4)) {
                                                            item2 = x;
                                                            x = automoviles.size();
                                                        } else {
                                                            item2 = 1000;
                                                        }
                                                    }
                                                    if (item2 <= automoviles.size()) {
                                                        automoviles.remove(item2);
                                                    } else {
                                                        System.out.println("No se encontro el VIN del automovil electrico en la lista. Consulte con el soporte tecnico de la compañia.");
                                                    }
                                                    break;
                                                }
                                                case 4: {
                                                    for (int z = 0; z < automoviles.size(); z++) {
                                                        if (automoviles.get(z) instanceof Electrico) {
                                                            System.out.println(automoviles.get(z));

                                                        }
                                                    }
                                                    break;
                                                }
                                                case 5: {
                                                    System.out.println("Ingrese el VIN del automovil electrico para calcular los días sin fallo");
                                                    String VIN4 = r.next();
                                                    int item2 = 0;
                                                    for (int x = 0; x < automoviles.size(); x++) {
                                                        String VIN3 = "";
                                                        if (automoviles.get(x) instanceof Electrico) {
                                                            VIN3 = ((Combustión) automoviles.get(x)).getVIN();
                                                        }
                                                        if (VIN3.equalsIgnoreCase(VIN4)) {
                                                            item2 = x;
                                                            x = automoviles.size();
                                                        } else {
                                                            item2 = 1000;
                                                        }
                                                        if (item2 <= automoviles.size()) {
                                                            System.out.println("Dias sin fallo " + ((Electrico) usuarios.get(item2)).diasSinFallo());
                                                        } else {
                                                            System.out.println("No se encontro el VIN del automovil electrico en la lista. Consulte con el soporte tecnico de la compañia.");
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    }

                                }
                            }

                        }

                    } else {
                        System.out.println("Su usuario/contraseña esta incorrecta o debe crear un usuario.");

                    }
                }
                break;

                case 2: {
                    System.out.println("Bienvenido al registro de clientes");
                    System.out.println("Ingrese su nombre de usuario");
                    String usuario = r.next();
                    System.out.println("Ingrese su contraseña");
                    String contraseña = r.next();
                    usuarios.add(new Usuarios(usuario, contraseña));
                    break;
                }
            }

        }

    }

}
