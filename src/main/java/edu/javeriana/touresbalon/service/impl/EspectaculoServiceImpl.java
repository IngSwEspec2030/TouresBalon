package edu.javeriana.touresbalon.service.impl;

import edu.javeriana.touresbalon.entities.Espectaculo;
import edu.javeriana.touresbalon.exceptions.NotFoundException;
import edu.javeriana.touresbalon.repository.EspectaculoRepository;
import edu.javeriana.touresbalon.service.EspectaculoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class EspectaculoServiceImpl implements EspectaculoService {

    @Autowired
    private EspectaculoRepository espectaculoRepository;

    @Override
    public Espectaculo crearEspectaculo(Espectaculo espectaculo) {

        espectaculoRepository.save(espectaculo);

        return espectaculo;
    }

    @Override
    public void eliminarEspectaculo(Espectaculo espectaculo) {

        espectaculoRepository.delete(espectaculo);

    }

    @Override
    public Optional<Espectaculo> consultarEspectaculo(int id) {
        Optional<Espectaculo> espectaculo = espectaculoRepository.findById(id);
        if (espectaculo.isEmpty())
            throw new NotFoundException("Espectaculo no encontrado");
        return espectaculo;

    }

    @Override
    public Iterable<Espectaculo> consultarListaEspectaculos() {
        Iterable<Espectaculo> listaEspectaculos = espectaculoRepository.findAll();
        if (!listaEspectaculos.iterator().hasNext())
            throw new NotFoundException("No hay espectaculos en la lista");
        return listaEspectaculos;
    }

}
