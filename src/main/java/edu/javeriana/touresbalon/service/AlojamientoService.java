package edu.javeriana.touresbalon.service;

import edu.javeriana.touresbalon.entities.Alojamiento;

import java.util.Optional;

public interface AlojamientoService {

    Alojamiento crearAlojamiento(Alojamiento alojamiento);

    void eliminarAlojamiento(Alojamiento alojamiento);

    Optional<Alojamiento> consultarAlojamiento(int id);

    Iterable<Alojamiento> consultarListaAlojamientos();
}
