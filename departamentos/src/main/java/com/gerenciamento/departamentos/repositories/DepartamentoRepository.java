package com.gerenciamento.departamentos.repositories;

import com.gerenciamento.departamentos.models.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}
