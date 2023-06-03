package com.proyectofinalprogra.prografinal.controller;

import com.proyectofinalprogra.prografinal.entity.Empleados;
import com.proyectofinalprogra.prografinal.entity.Tienda;
import com.proyectofinalprogra.prografinal.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    EmpleadoService empleadoService;

    @GetMapping
    public List<Empleados> listaEmpleados(){
        return empleadoService.findAll();
    }

    @GetMapping(value = "/buscar-por-id")
    public Optional<Empleados> obtenerEmpleado(@RequestParam Long id){
        return empleadoService.findById(id);
    }

    @PostMapping()
    public void crearEmpleado(@RequestBody Empleados empleados){
        empleadoService.createEmpleado(empleados);
    }

    @GetMapping(value = "/buscar-por-name")
    public List<Empleados> nombreEmpleado(@RequestParam String name){
        return empleadoService.findByName(name);
    }

    @PutMapping(value = "/{id}")
    public void modificarEmpleado(@PathVariable Long id, @RequestBody Empleados empleados){
        empleadoService.modifyEmpleado(id, empleados);
    }
    @DeleteMapping(value = "/{id}")
    public void borrarTienda(@PathVariable Long id){
        empleadoService.deleteEmpleado(id);
    }
}
