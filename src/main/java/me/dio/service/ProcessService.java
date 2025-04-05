package me.dio.service;

import me.dio.domain.model.Process;

import java.util.List;

public interface ProcessService {
  Process findById(Long id);
  List<Process> findByStatus(String status);
  List<Process> findByResponsavel(String responsavel);
  Process create(Process processToCreate);
  Process update(Long id, Process updatedProcess);
  void delete(Long id);
}
