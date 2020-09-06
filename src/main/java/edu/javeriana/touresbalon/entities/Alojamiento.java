package edu.javeriana.touresbalon.entities;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PACKAGE)
@Getter
@Table(name = "ALOJAMIENTO")
@Data
public class Alojamiento extends Producto {

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
    @JoinColumn(name = "idHabitacion", referencedColumnName = "ID_HABITACION", nullable = false)
    private Habitacion habitacion;

}
