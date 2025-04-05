package me.dio.domain.repository;

import me.dio.domain.model.Process;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProcessRepository extends JpaRepository<Process, Long> {
  List<Process> findByStatus(String status);
  List<Process> findByResponsavel(String responsavel);
  boolean existsByNumeroProcesso(String numeroProcesso);
}
