package com.example.Backend;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface IClienteDao extends Repository<Cliente, Integer> {

    List<Cliente> findAll();

    Cliente findById(int id);

    Cliente save(Cliente c);

    void delete(Cliente c);
}
