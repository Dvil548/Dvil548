package com.Bodeguin.ClienteServicio.Clontrollers;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Bodeguin.ClienteServicio.Entities.Cliente;
import com.Bodeguin.ClienteServicio.Service.ClienteService;
import com.Bodeguin.ClienteServicio.Dto.ClientesDefDto;
import com.Bodeguin.ClienteServicio.U.ClientU;


@RestController
@Getter

public class ClienteControllers {


    @Autowired
    private ClienteService ClienteService;

    @Autowired
    private ClientesDefDto ClienteDefDto;

    @Autowired
    private ClientU ClientU;
    @Autowired
    private Cliente Cliente;

    @GetMapping("/Cliente/{ClienteId}")
    public ResponseEntity<ClientesDefDto> findClienteById(@PathVariable("id") Long id) {
        Cliente Cliente = ClienteService.findClienteById(id);
        return new ResponseEntity<>(ClientU.ClientUtoDto(Cliente), HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "Cliente")
    public ResponseEntity<ClientesDefDto> CreateCliente(@RequestBody ClientesDefDto Cliente) {
        Cliente newCliente = ClientU.ClientUToEntity(Cliente);
        newCliente = ClienteService.saveCliente(newCliente);
        return new ResponseEntity<>(ClientU.ClientUtoDto(newCliente), HttpStatus.CREATED);
    }

    @ResponseStatus(HttpStatus.OK)

    @DeleteMapping(value = "Cliente/{id}")
    public ResponseEntity<ClientesDefDto> deleteCliente(@PathVariable("id") Long id) {
        Cliente Cliente = ClienteService.findClienteById(id);
        ClienteService.deleteCliente(Cliente);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
