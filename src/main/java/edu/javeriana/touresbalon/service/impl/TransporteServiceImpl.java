package edu.javeriana.touresbalon.service.impl;

import edu.javeriana.touresbalon.entities.Producto;
import edu.javeriana.touresbalon.entities.Proveedor;
import edu.javeriana.touresbalon.entities.TipoTransporte;
import edu.javeriana.touresbalon.entities.Transporte;
import edu.javeriana.touresbalon.exceptions.NotFoundException;
import edu.javeriana.touresbalon.repository.ProductoRepository;
import edu.javeriana.touresbalon.repository.ProveedorRepository;
import edu.javeriana.touresbalon.repository.TipoTransporteRepository;
import edu.javeriana.touresbalon.repository.TransporteRepository;
import edu.javeriana.touresbalon.service.ProductoService;
import edu.javeriana.touresbalon.service.TransporteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class TransporteServiceImpl implements TransporteService {

    @Autowired
    private TransporteRepository transporteRepository;
    @Autowired
    private TipoTransporteRepository tipoTransporteRepository;
    @Autowired
    private ProveedorRepository proveedorRepository;

    @Override
    public Transporte crearTransporte(Transporte transporte) {

        Optional<TipoTransporte> tipoTransporte = tipoTransporteRepository.findById(transporte.getTipoTransporte().getIdTipoTransporte());
        Optional<Proveedor> proveedor = proveedorRepository.findById(transporte.getProveedor().getIdProveedor());
        transporte.setTipoTransporte(tipoTransporte.orElse(null));
        transporte.setProveedor(proveedor.orElse(null));
        transporte = transporteRepository.save(transporte);

        return transporte;
    }
    @Override
    public void eliminarTransporte(Transporte transporte) {
        transporteRepository.delete(transporte);

    }

    @Override
    public Optional<Transporte> consultarTransporte(int id) {

        Optional<Transporte> producto = transporteRepository.findById(id);
        if(producto.isEmpty())
            throw new NotFoundException("Transporte no encontrado");
        return producto;

    }

    @Override
    public Iterable<Transporte> consultarListaTransportes() {
        Iterable<Transporte> listaTransportes = transporteRepository.findAll();
        if(!listaTransportes.iterator().hasNext())
            throw new NotFoundException("No hay transportes en la lista");
        return listaTransportes;
    }

}
