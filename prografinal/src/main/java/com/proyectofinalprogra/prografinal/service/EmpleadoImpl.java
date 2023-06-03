package com.proyectofinalprogra.prografinal.service;

import com.proyectofinalprogra.prografinal.dao.EmpleadoDao;
import com.proyectofinalprogra.prografinal.entity.Empleados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoImpl implements EmpleadoService{
    @Autowired
    private EmpleadoDao empleadoDao;
    @Override
    public List<Empleados> findAll() {
        return (List<Empleados>)empleadoDao.findAll();
    }

    @Override
    public Optional<Empleados> findById(Long id) {
        return empleadoDao.findById(id);
    }

    @Override
    public List<Empleados> findByName(String nombre) {
        return empleadoDao.findByName(nombre);
    }

    @Override
    public void createEmpleado(Empleados empleados) {
        empleadoDao.save(empleados);
    }

    @Override
    public void modifyEmpleado(Long id, Empleados empleados) {
        if(empleadoDao.existsById(id)){
            empleados.setId(id);
            empleadoDao.save(empleados);
        }
    }

    @Override
    public void deleteEmpleado(Long id) {
        if(empleadoDao.existsById(id)){
            empleadoDao.deleteById(id);
        }
    }
}
