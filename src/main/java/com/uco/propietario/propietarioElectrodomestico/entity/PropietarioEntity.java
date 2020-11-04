package com.uco.propietario.propietarioElectrodomestico.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table( name = "propietario")
@NoArgsConstructor
public class PropietarioEntity {
    @Id
    @Column(name="identificacion")
    private int identificacion;
    @Column(name="nombrePropietario")
    private String nombrePropietario;
    @Column(name="correo")
    private String correo;
    @Column(name="fechaInicio")
    private Date fechaInicio;
    @Column(name="direccion")
    private String direccion;
    @Column(name="telefono")
    private String telefono;
}
