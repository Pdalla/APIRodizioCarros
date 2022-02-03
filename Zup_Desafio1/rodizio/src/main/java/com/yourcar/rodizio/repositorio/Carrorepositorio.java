package com.yourcar.rodizio.repositorio;

import com.yourcar.rodizio.carros.Carrosinf;
import com.yourcar.rodizio.servidor.Carroval;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Carrorepositorio extends JpaRepository <Carrosinf, Integer> {
}
