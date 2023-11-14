package com.example.cadastrospacefinder.controller;
import com.example.cadastrospacefinder.model.Sala;
import com.example.cadastrospacefinder.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;

@CrossOrigin(origins = {"http://localhost:5173", "http://localhost:19006"}) // Endereço do front
@RestController

@RequestMapping("/salas")

public class SalaController {
    @Autowired
    private SalaRepository salaRepository;

    @GetMapping
    public List<Sala> listarSalas() {
        return salaRepository.findAll();
    }

    @PostMapping
    public Sala criarSala(@RequestBody Sala sala) {
        return salaRepository.save(sala);
    }

}
