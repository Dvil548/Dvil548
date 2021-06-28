package com.Bodeguin.ClienteServicio.Entities;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;
import java.util.Date;

@Entity
@JsonPropertyOrder({"Numero", "Tipo", "Caducidad"})
@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "Tarjeta")

public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Numero")
    private Boolean Numero;

    @Column(name= "Tipo")
    private String Tipo;

    @Column(name= "Caducidad")
    private Date Caducidad;

    @ManyToOne
    @JoinColumn(
            name="Cliente",
            nullable = false,
            referencedColumnName = "id",
            foreignKey =@ForeignKey(
                    name= "Tarjeta_Cliente_fk"
            )
    )
    private Cliente categoria;


}
