package com.example.laboratorio8.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "idTipoTicket")
    private String idTipoTicket;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario idUsuario;
}
