package com.example.cadastrospacefinder.repository;
import com.example.cadastrospacefinder.model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface SalaRepository extends JpaRepository<Sala, Long>  {
    
}
