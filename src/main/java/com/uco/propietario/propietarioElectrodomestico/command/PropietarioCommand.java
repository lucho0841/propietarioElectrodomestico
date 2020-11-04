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

}
