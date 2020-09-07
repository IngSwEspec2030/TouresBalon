package edu.javeriana.touresbalon.service.impl;

import edu.javeriana.touresbalon.entities.Producto;
import edu.javeriana.touresbalon.entities.Proveedor;
import edu.javeriana.touresbalon.exceptions.NotFoundException;
import edu.javeriana.touresbalon.repository.ProductoRepository;
import edu.javeriana.touresbalon.repository.ProveedorRepository;
import edu.javeriana.touresbalon.service.ProductoService;
import edu.javeriana.touresbalon.service.ProveedorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class ProveedorServiceImpl implements ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;

    @Override
    public Proveedor crearProveedor(Proveedor proveedor) {

        proveedorRepository.save(proveedor);

        return proveedor;
    }
    @Override
    public void eliminarProveedor(Proveedor proveedor) {

        proveedorRepository.delete(proveedor);

    }

    @Override
    public Optional<Proveedor> consultarProveedor(int id) {

        Optional<Proveedor> proveedor = proveedorRepository.findById(id);
        if(proveedor.isEmpty())
            throw new NotFoundException("Proveedor no encontrado");
        return proveedor;

    }

    @Override
    public Iterable<Proveedor> consultarListaProveedores() {
        Iterable<Proveedor> listaProveedores = proveedorRepository.findAll();
        if(!listaProveedores.iterator().hasNext())
            throw new NotFoundException("No hay proveedores en la lista");
        return listaProveedores;
    }

}
