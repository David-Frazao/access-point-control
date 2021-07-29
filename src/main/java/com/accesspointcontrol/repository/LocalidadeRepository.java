package com.accesspointcontrol.repository;

import com.accesspointcontrol.model.Localidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadeRepository extends JpaRepository<Localidade,Long> {
}
