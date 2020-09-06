package edu.javeriana.touresbalon.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PACKAGE)
@Getter
@Table(name = "UBICACION")
@Data
public class Ubicacion {

    @Id
    @Column(name = "ID_UBICACION")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idUbicacion;

    @Basic
    @Column(name = "NOMBRE")
    private String nombre;
}
