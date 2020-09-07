package edu.javeriana.touresbalon.service;

import edu.javeriana.touresbalon.entities.Producto;
import edu.javeriana.touresbalon.entities.Proveedor;

import java.util.Optional;

public interface ProveedorService {

    Proveedor crearProveedor(Proveedor proveedor);

    void eliminarProveedor(Proveedor proveedor);

    Optional<Proveedor> consultarProveedor(int id);

    Iterable<Proveedor> consultarListaProveedores();
}
