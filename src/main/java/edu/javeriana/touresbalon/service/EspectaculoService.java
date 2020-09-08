package edu.javeriana.touresbalon.service;

import edu.javeriana.touresbalon.dto.EspectaculoDTO;
import edu.javeriana.touresbalon.entities.Espectaculo;

import java.util.List;
import java.util.Optional;

public interface EspectaculoService {

    Espectaculo crearEspectaculo(Espectaculo espectaculo);

    void eliminarEspectaculo(Espectaculo espectaculo);

    Optional<Espectaculo> consultarEspectaculo(int id);

    List<EspectaculoDTO> consultarListaEspectaculos();
}
