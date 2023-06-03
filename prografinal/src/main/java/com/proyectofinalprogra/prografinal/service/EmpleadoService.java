package com.proyectofinalprogra.prografinal.service;

import com.proyectofinalprogra.prografinal.entity.Empleados;

import java.util.List;
import java.util.Optional;

public interface EmpleadoService {
    public List<Empleados> findAll();
    public Optional<Empleados> findById(Long id);
    public List<Empleados> findByName(String name);
    public void createEmpleado(Empleados empleados);
    public void modifyEmpleado(Long id, Empleados empleados);
    public void deleteEmpleado(Long id);
}
