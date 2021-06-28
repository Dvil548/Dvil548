package com.Bodeguin.ClienteServicio.Dto;

import lombok.Data;

import java.util.Date;

@Data
public class TarjetaDto {
    private Long id;
    private Boolean Numero;
    private String Tipo;
    private Date Caducidad;
}
