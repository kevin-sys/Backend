package com.example.Backend.controller;

import com.example.Backend.dao.ClienteService;
import com.example.Backend.model.Cliente;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/clientes"})
public class ClienteController {

    @Autowired
    ClienteService service;

    @GetMapping
    public List<Cliente> Listar() {
        return service.listar();
    }

    @PostMapping
    public Cliente Agregar(@RequestBody Cliente c) {
        return service.add(c);
    }

    @GetMapping(path = {"/{id}"})
    public Cliente listarId(@PathVariable("id") int id) {
        return service.listarId(id);
    }

    @PutMapping(path = {"/{id}"})
    public Cliente editar(@RequestBody Cliente c, @PathVariable("id") int id) {
        c.setId(id);
        return service.edit(c);
    }

    @DeleteMapping(path = {"/{id}"})
    public Cliente delete(@PathVariable("id") int id) {
        return service.delete(id);
    }
}
