package poo.clases;

import poo.herencia.Camion;
import poo.herencia.Coche;
import poo.herencia.Motocicleta;

public class Main {

    public static void main(String[] args){



        // 1. Clases y objetos
        // crear un objeto utilizando el contructor con parámetros
        Motor motorGTI = new Motor("GTI",190,459.0,6);

        Vehiculo forMondeo = new Vehiculo("Ford", "Mondeo", 2.1, 2020, false,0,motorGTI);

        System.out.println(forMondeo.fabricante);
        System.out.println(forMondeo.year);

        forMondeo.acelerar(50);
        System.out.println(forMondeo.speed);

        // 2. Herencia
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "Kawasaki";

        System.out.println("fin de programa");

        // 3. Polimorfismo
        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(50);

        vehiculo = new Camion();
        vehiculo.acelerar(50);

        // 4. Clases abstractas: no se pueden instanciar, solo se instancian las clases hijas.

    }
}
