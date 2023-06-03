package com.proyectofinalprogra.prografinal.controller;

import com.proyectofinalprogra.prografinal.entity.Tienda;
import com.proyectofinalprogra.prografinal.service.TiendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/tienda")
public class TiendaController {

    @Autowired
    TiendaService tiendaService;

    @GetMapping
    public List<Tienda> listaTienda(){
        return tiendaService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Tienda> obtenerTienda(@RequestParam Long id){
        return tiendaService.findById(id);
    }

    @PostMapping()
    public void crearTienda(@RequestBody Tienda tienda){
        tiendaService.createTienda(tienda);
    }

    @GetMapping(value = "/{name}")
    public List<Tienda> nombreTienda(@RequestParam String name){
        return tiendaService.findByName(name);
    }

    @PutMapping(value = "/{id}")
    public void modificarTienda(@PathVariable Long id, @RequestBody Tienda tienda){
        tiendaService.modifyTienda(id, tienda);
    }
    @DeleteMapping(value = "/{id}")
    public void borrarTienda(@PathVariable Long id){
        tiendaService.deleteTienda(id);
    }
}
