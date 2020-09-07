package edu.javeriana.touresbalon.entities;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PUBLIC)
@Getter
@Table(name = "TIPO_ESPECTACULO")
@Data
public class TipoEspectaculo {

    @Id
    @Column(name = "ID_TIPO_ESPECTACULO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idTipoEspectaculo;

    @Basic
    @Column(name = "NOMBRE")
    private String nombre;

}
