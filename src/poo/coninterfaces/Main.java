package poo.coninterfaces;

import poo.sininterfaces.Empleado;

public class Main {

    static EmpleadoCRUD empleadoCRUD;

    public static void main(String[] args){


        empleadoCRUD.finAll();
        empleadoCRUD.save(new Empleado());
    }
}
