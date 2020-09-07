package edu.javeriana.touresbalon.service;

import edu.javeriana.touresbalon.entities.Proveedor;
import edu.javeriana.touresbalon.entities.Transporte;

import java.util.Optional;

public interface TransporteService {

    Transporte crearTransporte(Transporte transporte);

    void eliminarTransporte(Transporte transporte);

    Optional<Transporte> consultarTransporte(int id);

    Iterable<Transporte> consultarListaTransportes();
}
