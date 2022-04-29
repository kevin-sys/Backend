package com.example.Backend.dao;
import java.util.List;
import com.example.Backend.model.Producto;


public interface ProductoService {
    List<Producto> listar();

    Producto listarId(int id);

    Producto add(Producto p);

    Producto edit(Producto p);

    Producto delete(int id);
}
