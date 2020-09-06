package edu.javeriana.touresbalon.repository;

import edu.javeriana.touresbalon.entities.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {

}