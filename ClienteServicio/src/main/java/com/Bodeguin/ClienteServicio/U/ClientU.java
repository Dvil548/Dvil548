package com.Bodeguin.ClienteServicio.U;

import com.Bodeguin.ClienteServicio.Dto.ClientesDefDto;
import com.Bodeguin.ClienteServicio.Entities.Cliente;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class ClientU {
    @Autowired
    private ModelMappper modelMapper;

    public  Cliente ClientUToEntity(ClientesDefDto Cliente) {
        return modelMapper.map(Cliente, Cliente.class);
    }

    public  ClientesDefDto ClientUtoDto(Cliente Cliente) {
        return modelMapper.map(Cliente, ClientesDefDto.class);
    }

    public Cliente map(Cliente ClienteToUpdate, Cliente Cliente) {
        modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
        modelMapper.map(ClienteToUpdate, Cliente);
        return Cliente;



}
