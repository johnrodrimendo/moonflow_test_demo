package com.moonflow.interview.service;

import com.moonflow.interview.model.Empleado;
import com.moonflow.interview.repository.Repository;

import java.util.List;

public class InterviewService {

    private Repository repository = new Repository();

    /**
     * Se requiere devolver todos los empleados que trabajan en la sucursal de la empresa enviada
     */
    public List<Empleado> getEmpleadosOfEmpresaScursal(int empresaId, String ciudadSucursal){
        return null;
    }


    public static void main(String[] args){
        InterviewService service = new InterviewService();
        List<Empleado> empleados = service.getEmpleadosOfEmpresaScursal(1, "Ayacucho");
        for(Empleado empleado : empleados){
            System.out.println(empleado.getNombre() + ", " + empleado.getApellido());
        }
    }
}
