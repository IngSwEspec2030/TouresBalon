package edu.javeriana.touresbalon.entities;

import lombok.*;

import javax.persistence.*;


@Entity
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PUBLIC)
@Getter
@Table(name = "USUARIO")
@Data
public class Usuario {

    @Id
    @Column(name = "ID_USUARIO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idUsuario;

    @Basic
    @Column(name = "PASSWORD")
    private String password;

    @Basic
    @Column(name = "ACTIVO")
    private boolean activo;



}
