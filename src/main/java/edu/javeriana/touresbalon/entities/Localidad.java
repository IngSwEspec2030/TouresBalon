package edu.javeriana.touresbalon.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="LOCALIDAD")
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PUBLIC)
@Getter
@Data
public class Localidad {

    @Id
    @Basic
    @Column(name = "ID_LOCALIDAD")
    private int idLocalidad;

    @Basic
    @Column(name = "NOMBRE")
    private String nombre;

    @Basic
    @Column(name = "AFORO")
    private int aforo;

}
