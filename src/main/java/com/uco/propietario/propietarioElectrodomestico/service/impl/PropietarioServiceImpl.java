package com.uco.propietario.propietarioElectrodomestico.service.impl;

import com.uco.propietario.propietarioElectrodomestico.command.PropietarioCommand;
import com.uco.propietario.propietarioElectrodomestico.fabrica.PropietarioFabrica;
import com.uco.propietario.propietarioElectrodomestico.repository.PropietarioRepository;
import com.uco.propietario.propietarioElectrodomestico.service.PropietarioService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PropietarioServiceImpl implements PropietarioService {

    @Autowired
    private PropietarioRepository propietarioRepository;

    @Autowired
    private PropietarioFabrica propietarioFabrica;


    @Override
    public List<PropietarioCommand> findAll() {
        return propietarioFabrica.entityToCommand(propietarioRepository.findAll());
    }

    @Override
    public PropietarioCommand findById(int identificacion) {
        return PropietarioFabrica.commandtoEntity(propietarioRepository.findById(identificacion).orElse(null));
    }
}
