package com.proyectofinalprogra.prografinal.service;


import com.proyectofinalprogra.prografinal.entity.Tienda;

import java.util.List;
import java.util.Optional;

public interface TiendaService {
    public List<Tienda> findAll();
    public Optional<Tienda> findById(Long id);
    public List<Tienda> findByName(String name);
    public void createTienda(Tienda tienda);
    public void modifyTienda(Long id, Tienda tienda);
    public void deleteTienda(Long id);
}
