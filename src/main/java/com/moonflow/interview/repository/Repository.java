package com.moonflow.interview.repository;

import com.moonflow.interview.model.Empleado;
import com.moonflow.interview.model.Empresa;
import com.moonflow.interview.model.Sucursal;

import java.util.Arrays;
import java.util.List;

public class Repository {

    /**
     * Listado de empleados
     */
    public List<Empleado> getEmpleados() {
        return Arrays.asList(
                new Empleado(1, "Juan", "Perez"),
                new Empleado(2, "Milagros", "Mendoza"),
                new Empleado(3, "Pablo", "Flores"),
                new Empleado(4, "George", "Lennon"),
                new Empleado(5, "Bob", "Orwell"),
                new Empleado(6, "Jimmy", "Vargas"),
                new Empleado(7, "Juan", "Loza"),
                new Empleado(8, "Domingo", "Castilla"),
                new Empleado(9, "Jose", "Ango"),
                new Empleado(10, "Maria", "Townsed"),
                new Empleado(11, "Fernanda", "Rodriguez")
        );
    }

    /**
     * Listado de empresas
     */
    public List<Empresa> getEmpresas() {
        return Arrays.asList(
                new Empresa(1, "Moonflow"),
                new Empresa(2, "Coca Cola"),
                new Empresa(3, "Fundacion Pepito's")
        );
    }

    /**
     * Listado de sucursales de la empresa con el listad de ids de ususarios que trabajan en ella
     */
    public List<Sucursal> getSucursales() {
        return Arrays.asList(
                new Sucursal("Lima", 1, Arrays.asList(1, 3, 4)),
                new Sucursal("Buenos Aires", 1, Arrays.asList(2,5,6)),
                new Sucursal("Ayacucho", 2, Arrays.asList(7,9)),
                new Sucursal("Lima", 2, Arrays.asList(8,10)),
                new Sucursal("Lima", 3, Arrays.asList(11))
        );
    }

}
