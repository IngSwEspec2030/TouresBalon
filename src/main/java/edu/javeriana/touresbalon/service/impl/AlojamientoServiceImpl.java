package edu.javeriana.touresbalon.service.impl;

import edu.javeriana.touresbalon.entities.Alojamiento;
import edu.javeriana.touresbalon.entities.Producto;
import edu.javeriana.touresbalon.exceptions.NotFoundException;
import edu.javeriana.touresbalon.repository.AlojamientoRepository;
import edu.javeriana.touresbalon.repository.ProductoRepository;
import edu.javeriana.touresbalon.service.AlojamientoService;
import edu.javeriana.touresbalon.service.ProductoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class AlojamientoServiceImpl implements AlojamientoService {

    @Autowired
    private AlojamientoRepository alojamientoRepository;

    @Override
    public Alojamiento crearAlojamiento(Alojamiento alojamiento) {

        alojamientoRepository.save(alojamiento);

        return alojamiento;
    }
    @Override
    public void eliminarAlojamiento(Alojamiento alojamiento) {

        alojamientoRepository.delete(alojamiento);

    }

    @Override
    public Optional<Alojamiento> consultarAlojamiento(int id) {

        Optional<Alojamiento> alojamiento = alojamientoRepository.findById(id);
        if(alojamiento.isEmpty())
            throw new NotFoundException("Alojamiento no encontrado");
        return alojamiento;

    }

    @Override
    public Iterable<Alojamiento> consultarListaAlojamientos() {
        Iterable<Alojamiento> listaAlojamientos = alojamientoRepository.findAll();
        if(!listaAlojamientos.iterator().hasNext())
            throw new NotFoundException("No hay alojamientos en la lista");
        return listaAlojamientos;
    }

}
