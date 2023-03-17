package poo.clases;

public class Main {

    public static void main(String[] args){

        // Clase identificador = new Clase()

        // crear un objeto utilizando el contructor vacío
        Vehiculo toyotaPrius = new Vehiculo();

        // crear un objeto utilizando el contructor con parámetros
        Motor motorGTI = new Motor("GTI",190,459.0,6);

        Vehiculo forMondeo = new Vehiculo("Ford", "Mondeo", 2.1, 2020, false,0,motorGTI);

        System.out.println(forMondeo.fabricante);
        System.out.println(forMondeo.year);

        forMondeo.acelerar(50);
        System.out.println(forMondeo.speed);
    }
}
