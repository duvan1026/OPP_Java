package poo.clases;

public class Vehiculo {

    // 1. atributos
    String fabricantes;
    String modelo;
    double cc;
    int year;
    boolean sport;



    // 2. Constructores
    public Vehiculo(){

    }

    public Vehiculo( String fabricante, String modelo, double cc, int year, boolean sport ){
        this.fabricantes = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
    }

    public Vehiculo( String fabricantes, String modelo ){
        this.fabricantes = fabricantes;
        this.modelo = modelo;
    }


    // 3. Metodos (comportamientos)

}
