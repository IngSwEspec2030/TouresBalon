package edu.javeriana.touresbalon.entities;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PACKAGE)
@Getter
@Table(name = "ESPECTACULO")
@Data
public class Espectaculo extends Producto {

    @Basic
    @Column(name = "NOMBRE")
    private String nombre;

    @Basic
    @Column(name = "CIUDAD")
    private String ciudad;

    @Basic
    @Column(name = "VALOR")
    private BigDecimal valor;

    @OneToOne
    @JoinColumn(name = "idTipoEspectaculo", referencedColumnName = "ID_TIPO_ESPECTACULO", nullable = false)
    private TipoEspectaculo tipoEspectaculo;

    @OneToOne
    @JoinColumn(name = "idUbicacion", referencedColumnName = "ID_UBICACION", nullable = false)
    private Ubicacion ubicacion;
}
