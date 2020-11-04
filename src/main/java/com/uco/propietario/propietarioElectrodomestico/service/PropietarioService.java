package com.uco.propietario.propietarioElectrodomestico.service;


import com.uco.propietario.propietarioElectrodomestico.command.PropietarioCommand;

import java.util.List;

public interface PropietarioService {
    List<PropietarioCommand> findAll();

    PropietarioCommand findById(int identificacion);
}
