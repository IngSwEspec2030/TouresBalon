package edu.javeriana.touresbalon.repository;

import edu.javeriana.touresbalon.entities.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

}