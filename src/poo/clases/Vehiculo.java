package poo.clases;

/**
 * Clase base o superclase o clase padre
 */
public  class Vehiculo {

    // 1. atributos
    protected String fabricante;
    protected String modeloVehiculo;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected int speed;
    protected Motor motor;


    // 2. Constructores
    public Vehiculo() {

    }

    public Vehiculo(String fabricante, String modeloVehiculo, double cc, int year, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modeloVehiculo = modeloVehiculo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modeloVehiculo) {
        this.fabricante = fabricante;
        this.modeloVehiculo = modeloVehiculo;
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
