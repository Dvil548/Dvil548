package com.Bodeguin.ClienteServicio.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import java.util.Optional;
import com.Bodeguin.ClienteServicio.Repositories.ClienteRepository;
import com.Bodeguin.ClienteServicio.Entities.Cliente;
import com.Bodeguin.ClienteServicio.Exceptions.ClienteNotFound;

@Slf4j
@Service
@Repository
public class ClienteService {

    @Autowired
    private ClienteRepository ClienteRepository;

    public Cliente findClienteById(Long id) {
        Optional<Cliente> Cliente = ClienteRepository.findById(id);
        return Cliente.orElseThrow(() -> new ClienteNotFound(id.toString()));
    }

    public Cliente saveCliente(Cliente Cliente) {
        return ClienteRepository.save(Cliente);
    }

    public Cliente deleteCliente(Cliente Cliente) {
        ClienteRepository.delete(Cliente);
        return Cliente;
    }
}
