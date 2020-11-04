package com.uco.propietario.propietarioElectrodomestico.fabrica;

import com.uco.propietario.propietarioElectrodomestico.command.PropietarioCommand;
import com.uco.propietario.propietarioElectrodomestico.entity.PropietarioEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PropietarioFabrica {

    public List<PropietarioCommand> entityToCommand(List<PropietarioEntity> listaPropietarioEntity) {
        List<PropietarioCommand> listaPropietarioCommand = new ArrayList<>();
        listaPropietarioEntity.forEach(e -> listaPropietarioCommand.add(entityToCommand(e)));
        return listaPropietarioCommand;
    }

    public PropietarioCommand commandtoEntity(PropietarioEntity propietarioEntity) {
        PropietarioCommand propietarioCommand = new PropietarioCommand();
        propietarioCommand.setIdentificacion(propietarioEntity.getIdentificacion());
        propietarioCommand.setNombrePropietario(propietarioEntity.getNombrePropietario());
        propietarioCommand.setCorreo(propietarioEntity.getCorreo());
        propietarioCommand.setFechaInicio(propietarioEntity.getFechaInicio());
        propietarioCommand.setDireccion(propietarioEntity.getDireccion());
        propietarioCommand.setTelefono(propietarioEntity.getTelefono());
        return propietarioCommand;
    }


}
