package com.proyectofinalprogra.prografinal.dao;

import com.proyectofinalprogra.prografinal.entity.Tienda;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TiendaDao extends CrudRepository<Tienda, Long> {
    List<Tienda> findByName(String name);
}
