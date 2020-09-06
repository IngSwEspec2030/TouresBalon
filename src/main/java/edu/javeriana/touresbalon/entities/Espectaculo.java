package edu.javeriana.touresbalon.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="PRODUCTO")
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PACKAGE)
@Getter
@DiscriminatorValue("ESPECTACULO")
@Data
public class Espectaculo extends Producto {

    @Basic
    @Column(name = "CIUDAD")
    private String ciudad;

    @OneToOne
    @JoinColumn(name = "idTipoEspectaculo", referencedColumnName = "ID_TIPO_ESPECTACULO", nullable = false)
    private TipoEspectaculo tipoEspectaculo;

    @OneToOne
    @JoinColumn(name = "idUbicacion", referencedColumnName = "ID_UBICACION", nullable = false)
    private Ubicacion ubicacion;
}
