package com.example.Backend.controller;

import com.example.Backend.dao.ProductoService;
import com.example.Backend.model.Producto;
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
@RequestMapping({"/productos"})
public class ProductoController {

    @Autowired
    ProductoService service;

    @GetMapping
    public List<Producto> Listar() {
        return service.listar();
    }

    @PostMapping
    public Producto Agregar(@RequestBody Producto c) {
        return service.add(c);
    }

    @GetMapping(path = {"/{id}"})
    public Producto listarId(@PathVariable("id") int id) {
        return service.listarId(id);
    }

    @PutMapping(path = {"/{id}"})
    public Producto editar(@RequestBody Producto c, @PathVariable("id") int id) {
        c.setId(id);
        return service.edit(c);
    }

    @DeleteMapping(path = {"/{id}"})
    public Producto delete(@PathVariable("id") int id) {
        return service.delete(id);
    }

}
