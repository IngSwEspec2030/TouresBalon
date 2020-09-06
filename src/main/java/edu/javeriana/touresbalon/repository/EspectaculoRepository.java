package edu.javeriana.touresbalon.repository;

import edu.javeriana.touresbalon.entities.Espectaculo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EspectaculoRepository extends CrudRepository<Espectaculo, Integer> {

}