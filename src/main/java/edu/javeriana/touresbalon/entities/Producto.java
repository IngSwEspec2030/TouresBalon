package edu.javeriana.touresbalon.entities;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PACKAGE)
@Getter
@Table(name = "PRODUCTO")
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Producto {
    @Id
    @Column(name = "ID_PRODUCTO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idProducto;

    @Basic
    @Column(name = "NOMBRE")
    private String nombre;

    @Basic
    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Basic
    @Column(name = "CANTIDAD")
    private int cantidad;

    @Basic
    @Column(name = "PRECIO")
    private BigDecimal precio;

    @Basic
    @Column(name = "ESTADO")
    private boolean estado;

    @Basic
    @Column(name = "FECHA REGISTO")
    private Timestamp fechaRegistro;

    @Basic
    @Column(name = "COMISION")
    private BigDecimal comision;

    @Column(name = "IMAGEN")
    private String imagen;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "PRODUCTO_RESERVA",
            joinColumns = {@JoinColumn(name = "ID_PRODUCTO")},
            inverseJoinColumns = {@JoinColumn(name = "ID_RESERVA")}
    )
    private List<Reserva> reservas;

    @ManyToOne
    @JoinColumn(name = "idProveedor", referencedColumnName = "ID_PROVEEDOR", nullable = false)
    private Proveedor proveedor;


}
