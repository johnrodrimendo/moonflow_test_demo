package com.moonflow.interview.model;

import java.util.List;

public class Sucursal {

    private String ciudad;
    private Integer empresaId;
    private List<Integer> empleados;

    public Sucursal(String ciudad, Integer empresaId, List<Integer> empleados) {
        this.ciudad = ciudad;
        this.empresaId = empresaId;
        this.empleados = empleados;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Integer empresaId) {
        this.empresaId = empresaId;
    }

    public List<Integer> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Integer> empleados) {
        this.empleados = empleados;
    }
}
