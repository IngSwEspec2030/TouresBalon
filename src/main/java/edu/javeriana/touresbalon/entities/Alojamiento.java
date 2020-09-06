package edu.javeriana.touresbalon.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="PRODUCTO")
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PACKAGE)
@Getter
@DiscriminatorValue("ALOJAMIENTO")
@Data
public class Alojamiento extends Producto {


    @Basic
    @Column(name = "CIUDAD")
    private String ciudad;

    @OneToOne
    @JoinColumn(name = "idHabitacion", referencedColumnName = "ID_HABITACION", nullable = false)
    private Habitacion habitacion;

}
