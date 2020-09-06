package edu.javeriana.touresbalon.service.impl;

import edu.javeriana.touresbalon.entities.Producto;
import edu.javeriana.touresbalon.repository.ProductoRepository;
import edu.javeriana.touresbalon.service.ProductoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto crearProducto(Producto producto) {

        productoRepository.save(producto);

        return producto;
    }
    @Override
    public void eliminarProducto(Producto producto) {

        productoRepository.delete(producto);

    }

    @Override
    public Optional<Producto> consultarProducto(int id) {

        Optional<Producto> producto = productoRepository.findById(id);
        return producto;

    }

}
