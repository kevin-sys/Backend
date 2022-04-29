package com.example.Backend.dao;

import com.example.Backend.idao.IProductoDao;
import com.example.Backend.model.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoDaoImpl implements ProductoService {

    @Autowired
    private IProductoDao repositorio;

    @Override
    public List<Producto> listar() {
        return repositorio.findAll();
    }

    @Override
    public Producto add(Producto p) {
        return repositorio.save(p);
    }

    @Override
    public Producto listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Producto edit(Producto p) {
        return repositorio.save(p);
    }

    @Override
    public Producto delete(int id) {
        Producto p = repositorio.findById(id);
        if (p != null) {
            repositorio.delete(p);
        }
        return p;
    }
}
