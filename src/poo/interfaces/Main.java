package poo.interfaces;

import java.util.List;

public class Main {
    public static void main(String[] args){

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();


        Empleado juanito = new Empleado("Juanito", 30, 40000, true);
        Empleado patrica = new Empleado("Patricia", 30, 40000, true);
        Empleado roberto = new Empleado("Roberto", 30, 40000, true);

        System.out.println(juanito);

        // guardar empleados
        empleadoCRUD.save(juanito);
        empleadoCRUD.save(patrica);
        empleadoCRUD.save(roberto);

        // Consultar empleados
        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);




    }

}
