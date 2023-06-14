package com.example.laboratorio8.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "local")
@Getter
@Setter
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "latitud")
    private String latitud;

    @Column(name="longitud")
    private String longitud;

    @ManyToOne
    @JoinColumn(name = "idEmpresa")
    private Empresa empresa;

}
