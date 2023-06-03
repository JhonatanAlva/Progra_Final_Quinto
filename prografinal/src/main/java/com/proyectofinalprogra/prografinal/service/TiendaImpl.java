package com.proyectofinalprogra.prografinal.service;

import com.proyectofinalprogra.prografinal.dao.TiendaDao;
import com.proyectofinalprogra.prografinal.entity.Tienda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TiendaImpl implements TiendaService{
    @Autowired
    private TiendaDao tiendaDao;

    @Override
    public List<Tienda> findAll() {
        return (List<Tienda>)tiendaDao.findAll();
    }

    @Override
    public Optional<Tienda> findById(Long id) {
        return tiendaDao.findById(id);
    }

    @Override
    public List<Tienda> findByName(String name) {
        return tiendaDao.findByName(name);
    }

    @Override
    public void createTienda(Tienda tienda) {
        tiendaDao.save(tienda);
    }

    @Override
    public void modifyTienda(Long id, Tienda tienda) {
        if(tiendaDao.existsById(id)){
            tienda.setId(id);
            tiendaDao.save(tienda);
        }
    }

    @Override
    public void deleteTienda(Long id) {
        if(tiendaDao.existsById(id)){
            tiendaDao.deleteById(id);
        }
    }
}
