package poo.clases;

public class Vehiculo {

    // 1. atributos
    String fabricantes;
    String modelo;
    double cc;
    int year;
    boolean sport;
    int speed;


    // 2. Constructores
    public Vehiculo() {

    }

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport) {
        this.fabricantes = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = 0;
    }

    public Vehiculo(String fabricantes, String modelo) {
        this.fabricantes = fabricantes;
        this.modelo = modelo;
    }

    public Vehiculo(String fabricantes, int year) {
        this.fabricantes = fabricantes;
        this.year = year;
    }

    // 3. Metodos (comportamientos)
    public void acelerar(int quantity) {
        this.speed += quantity;
    }

    // getter y setter


    //tostring

}
