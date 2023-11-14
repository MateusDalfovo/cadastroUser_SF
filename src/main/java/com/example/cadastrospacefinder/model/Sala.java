package com.example.cadastrospacefinder.model;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

@Entity
@Getter
@Setter

public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id_Sala;
    private String nome;
    private String especificacao;
    
    
}
