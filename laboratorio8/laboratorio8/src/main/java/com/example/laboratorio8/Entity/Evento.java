package com.example.laboratorio8.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "evento")
@Getter
@Setter
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "nombre")
    private String nombre;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="path_image")
    private String path_image;

    @ManyToOne
    @JoinColumn(name = "idLocal")
    private Local idLocal;
}
