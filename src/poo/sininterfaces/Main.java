package poo.sininterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args){

        EmpleadoCRUDV2 empleadoCRUDV2 = new EmpleadoCRUDV2();


        Empleado juanito = new Empleado("Juanito", 30, 40000, true);
        Empleado patrica = new Empleado("Patricia", 30, 40000, true);
        Empleado roberto = new Empleado("Roberto", 30, 40000, true);

        System.out.println(juanito);

        // guardar empleados
//        empleadoCRUDV2.save(juanito);
//        empleadoCRUDV2.save(patrica);
//        empleadoCRUDV2.save(roberto);

        // Consultar empleados
        List<Empleado> empleados = empleadoCRUDV2.recuperarEmpleados();
        System.out.println(empleados);

    }

}
