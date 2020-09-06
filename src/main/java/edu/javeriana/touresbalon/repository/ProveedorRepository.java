package edu.javeriana.touresbalon.repository;

import edu.javeriana.touresbalon.entities.Proveedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProveedorRepository extends CrudRepository<Proveedor, Integer> {

}