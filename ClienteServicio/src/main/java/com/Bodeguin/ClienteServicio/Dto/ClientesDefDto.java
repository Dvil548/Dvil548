package com.Bodeguin.ClienteServicio.Dto;

import lombok.Data;

@Data

public class ClientesDefDto {
    private Long Id;
    private ClienteDto Cliente;
    private TarjetaDto Tarjeta;
}
