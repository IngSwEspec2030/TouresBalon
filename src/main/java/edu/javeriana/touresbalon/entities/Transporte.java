package edu.javeriana.touresbalon.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="PRODUCTO")
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PACKAGE)
@Getter
@DiscriminatorValue("TRANSPORTE")
@Data
public class Transporte extends Producto {

    @Basic
    @Column(name = "NUMERO_TRANSPORTE")
    private String numeroTransporte;

    @Basic
    @Column(name = "CIUDAD_ORIGEN")
    private String ciudadOrigen;

    @Basic
    @Column(name = "CIUDAD_DESTINO")
    private String ciudadDestino;

    @OneToOne
    @JoinColumn(name = "idTipoTransporte", referencedColumnName = "ID_TIPO_TRANSPORTE", nullable = false)
    private TipoTransporte tipoTransporte;
}
