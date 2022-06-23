package com.generation.repositories;

import com.generation.models.Licencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenciaRepository  extends JpaRepository<Licencia, Long> {


}
