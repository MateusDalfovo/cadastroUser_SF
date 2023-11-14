package com.example.cadastrospacefinder.model;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;


@Entity
@Getter
@Setter

public class Reservado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_Reservado;
    private String nome_Reservado;
    private String especificacao_Reservado;
    
}