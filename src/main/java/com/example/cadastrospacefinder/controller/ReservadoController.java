package com.example.cadastrospacefinder.controller;
import com.example.cadastrospacefinder.model.Reservado;
import com.example.cadastrospacefinder.repository.ReservadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;

@CrossOrigin(origins = {"http://localhost:5173", "http://localhost:19006"}) // Endereço do front
@RestController

@RequestMapping("/reservados")

public class ReservadoController {
    @Autowired
    private ReservadoRepository reservadoRepository;

    @GetMapping
    public List<Reservado> listarReservados() {
        return reservadoRepository.findAll();
    }

    @PostMapping
    public Reservado criarReservado(@RequestBody Reservado reservado) {
        return reservadoRepository.save(reservado);
    }

}