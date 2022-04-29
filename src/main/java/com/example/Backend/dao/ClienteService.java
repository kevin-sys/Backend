package com.example.Backend.dao;
import com.example.Backend.model.Cliente;
import java.util.List;

public interface ClienteService {

    List<Cliente> listar();

    Cliente listarId(int id);

    Cliente add(Cliente u);

    Cliente edit(Cliente u);

    Cliente delete(int id);
}
