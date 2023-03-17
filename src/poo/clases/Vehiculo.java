package poo.clases;

public class Vehiculo {

    // 1. atributos
    String fabricante;
    String modelo;
    double cc;
    int year;
    boolean sport;
    int speed;


    // 2. Constructores
    public Vehiculo() {

    }

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = 0;
    }

    public Vehiculo(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Vehiculo(String fabricante, int year) {
        this.fabricante = fabricante;
        this.year = year;
    }

    // 3. Metodos (comportamientos)
    public void acelerar(int quantity) {
        this.speed += quantity;
    }

    // getter y setter


    //tostring

}
