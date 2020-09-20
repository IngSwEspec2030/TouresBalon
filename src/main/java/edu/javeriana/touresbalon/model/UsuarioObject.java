package edu.javeriana.touresbalon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioObject {
  private Integer idUsuario;
  private String nombre;
  private String email;
}
