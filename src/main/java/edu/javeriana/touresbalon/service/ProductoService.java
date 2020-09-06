package edu.javeriana.touresbalon.service;

import edu.javeriana.touresbalon.entities.Producto;

import java.util.Optional;

public interface ProductoService {

    Producto crearProducto(Producto producto);

    void eliminarProducto(Producto producto);

    Optional<Producto> consultarProducto(int id);
}
