package com.example.Backend;

import java.util.List;

public interface ClienteService {

    List<Cliente> listar();

    Cliente listarId(int id);

    Cliente add(Cliente u);

    Cliente edit(Cliente u);

    Cliente delete(int id);
}
