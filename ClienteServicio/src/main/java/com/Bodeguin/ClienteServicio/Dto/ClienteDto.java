package com.Bodeguin.ClienteServicio.Dto;

import lombok.Data;

@Data
public class ClienteDto {
    private Long id;
    private String Password;
    private String Nombre;
    private String Apellidos;
    private String Direccion;
    private String Correo;
    private Boolean DNI;
    private String EsAdm;
    private String EsVendedor;

}
