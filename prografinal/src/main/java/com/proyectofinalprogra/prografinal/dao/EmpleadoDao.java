package com.proyectofinalprogra.prografinal.dao;


import com.proyectofinalprogra.prografinal.entity.Empleados;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmpleadoDao extends CrudRepository<Empleados, Long> {
    List<Empleados> findByName(String nombre);
}
