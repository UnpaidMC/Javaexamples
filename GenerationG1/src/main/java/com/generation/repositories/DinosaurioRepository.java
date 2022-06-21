package com.generation.repositories;

import com.generation.models.Dinosaurio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DinosaurioRepository extends JpaRepository<Dinosaurio, Long>{
}
