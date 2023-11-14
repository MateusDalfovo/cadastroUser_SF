package com.example.cadastrospacefinder.repository;
import com.example.cadastrospacefinder.model.Reservado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface ReservadoRepository extends JpaRepository<Reservado, Long>  {
    
}