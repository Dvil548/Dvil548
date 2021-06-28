package com.Bodeguin.ClienteServicio.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)

public class ClienteNotFound extends RuntimeException {
    public ClienteNotFound(String message) {
        super(message);
    }
}
