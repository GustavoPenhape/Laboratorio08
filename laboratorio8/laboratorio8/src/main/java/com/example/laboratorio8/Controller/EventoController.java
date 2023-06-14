package com.example.laboratorio8.Controller;


import com.example.laboratorio8.Entity.Evento;
import com.example.laboratorio8.Repository.EventoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EventoController {
    final EventoRepository eventoRepository;

    public EventoController(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    @GetMapping(value = "/evento")
    public List<Evento> listarEventos() {
        return eventoRepository.findAll();
    }

    @GetMapping("/evento/{id}")
    public ResponseEntity<?> obtenerEventoPorId(@PathVariable("id") Integer id) {
        if (id == null) {
            return ResponseEntity.badRequest().body("el id debe ser un numero entero positivo");
        }
        Optional<Evento> eventoOptional = eventoRepository.findById(id);
        if (eventoOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Evento No encontrado.");
        }
        Evento evento = eventoOptional.get();
        return ResponseEntity.ok(evento);
    }

}


