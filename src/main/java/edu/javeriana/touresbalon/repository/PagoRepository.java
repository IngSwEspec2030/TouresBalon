package edu.javeriana.touresbalon.repository;

import edu.javeriana.touresbalon.entities.Pago;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PagoRepository extends CrudRepository<Pago, Integer> {

}