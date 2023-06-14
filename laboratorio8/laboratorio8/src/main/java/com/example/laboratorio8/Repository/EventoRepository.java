package com.example.laboratorio8.Repository;

import com.example.laboratorio8.Entity.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EventoRepository extends JpaRepository<Evento, Integer> {
}
