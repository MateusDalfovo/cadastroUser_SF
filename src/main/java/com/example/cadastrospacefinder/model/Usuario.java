package com.example.cadastrospacefinder.model;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter

public class Usuario {
    @Id
    
    
    private String cpf;
    private String nome;
    private String email;
    private Long senha;
    private String matricula;
    private String sobrenome;
    private String disciplina;
    private String turma;
    private String usuarioTipo;

   @ManyToOne
   private Sala sala;
    

}
