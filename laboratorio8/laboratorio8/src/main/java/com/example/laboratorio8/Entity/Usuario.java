package com.example.laboratorio8.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario", nullable = false)
    private Integer idusuario;

    @Column(name = "dni")
    private String dni;

    @Column(name = "correo")
    private String correo;

    @Column(name="nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;
}
