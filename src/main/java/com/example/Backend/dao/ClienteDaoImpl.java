package com.example.Backend.dao;

import com.example.Backend.idao.IClienteDao;
import com.example.Backend.model.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteDaoImpl implements ClienteService {

    @Autowired
    private IClienteDao repositorio;

    @Override
    public List<Cliente> listar() {
        return repositorio.findAll();
    }

    @Override
    public Cliente add(Cliente c) {
        return repositorio.save(c);
    }

    @Override
    public Cliente listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Cliente edit(Cliente c) {
        return repositorio.save(c);
    }

    @Override
    public Cliente delete(int id) {
        Cliente c = repositorio.findById(id);
        if (c != null) {
            repositorio.delete(c);
        }
        return c;
    }
}
