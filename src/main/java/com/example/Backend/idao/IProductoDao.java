package com.example.Backend.idao;

import com.example.Backend.model.Producto;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface IProductoDao extends Repository<Producto, Integer> {

    List<Producto> findAll();

    Producto findById(int id);

    Producto save(Producto p);

    void delete(Producto p);
}
