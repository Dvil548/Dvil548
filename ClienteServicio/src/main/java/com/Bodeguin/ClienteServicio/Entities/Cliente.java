package com.Bodeguin.ClienteServicio.Entities;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;
import java.util.ArrayList;

import java.util.List;

@Entity
@JsonPropertyOrder({"Password", "Nombres", "Apellidos", "Direccion", "Correo", "Dni", "EsAdm", "EsVendedor"})
@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "Cliente")

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Password")
    private String Password;

    @Column(name= "Nombres")
    private String Nombres;

    @Column(name= "Apellidos")
    private String Apellido;

    @Column(name= "Direccion")
    private String Direccion;

    @Column(name= "Correo")
    private String Correo;

    @Column(name= "DNI")
    private Boolean DNI;

    @Column(name= "EsAdm")
    private String EsAdm;

    @Column(name= "EsVendedor")
    private String EsVendedor;

    @OneToMany(
            mappedBy ="Tarjeta",
            cascade ={CascadeType.PERSIST, CascadeType.REMOVE},
            fetch =FetchType.LAZY
    )
    private List<Tarjeta> Tarjeta = new ArrayList<>();


}
