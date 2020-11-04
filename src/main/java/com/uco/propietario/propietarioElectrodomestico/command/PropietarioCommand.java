package com.uco.propietario.propietarioElectrodomestico.command;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;


@Data
@Component
@NoArgsConstructor
public class PropietarioCommand {
    private int identificacion;
    private String nombrePropietario;
    private String correo;
    private Date fechaInicio;
    private String direccion;
    private String telefono;

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
