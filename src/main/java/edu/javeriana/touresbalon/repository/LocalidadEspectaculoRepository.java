package edu.javeriana.touresbalon.repository;

import edu.javeriana.touresbalon.entities.Espectaculo;
import edu.javeriana.touresbalon.entities.Localidad;
import edu.javeriana.touresbalon.entities.LocalidadEspectaculo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LocalidadEspectaculoRepository extends CrudRepository<LocalidadEspectaculo, Integer> {

    @Query("SELECT u FROM LocalidadEspectaculo u WHERE u.espectaculo = ?1")
    List<LocalidadEspectaculo> findLocalidadByEspectaculo(Espectaculo e);

}