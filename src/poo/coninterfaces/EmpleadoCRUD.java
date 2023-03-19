package poo.coninterfaces;

import poo.sininterfaces.Empleado;

import java.util.List;


/**
 * Se declaran los metodos , no se implemetan.
 *
 * Actua como un contrato, dice lo que hay que hacer pero no lo realiza.
 */
public interface EmpleadoCRUD {

    void save(Empleado empleado);

    List<Empleado> finAll();

    void delete(Empleado empleado);

}
