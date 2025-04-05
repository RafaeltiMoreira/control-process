package me.dio.service.impl;

import me.dio.domain.model.Process;
import me.dio.domain.repository.ProcessRepository;
import me.dio.service.ProcessService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProcessServiceImpl implements ProcessService {
  private final ProcessRepository processRepository;

  public ProcessServiceImpl(ProcessRepository processRepository) {
    this.processRepository = processRepository;
  }

  @Override
  public Process findById(Long id) {
    return processRepository.findById(id).orElseThrow(NoSuchElementException::new);
  }

  @Override
  public List<Process> findByStatus(String status) {
    return processRepository.findByStatus(status);
  }

  @Override
  public List<Process> findByResponsavel(String responsavel) {
    return processRepository.findByResponsavel(responsavel);
  }

  @Override
  public Process create(Process processToCreate) {
    if (processRepository.existsByNumeroProcesso(processToCreate.getNumeroProcesso())) {
      throw new IllegalArgumentException("Process already exists with number: " + processToCreate.getNumeroProcesso());
    }
    return processRepository.save(processToCreate);
  }

  @Override
  public Process update(Long id, Process updatedProcess) {
    Process existingProcess = findById(id);

    existingProcess.setTitulo(updatedProcess.getTitulo());
    existingProcess.setGerencia(updatedProcess.getGerencia());
    existingProcess.setStatus(updatedProcess.getStatus());
    existingProcess.setPrioridade(updatedProcess.getPrioridade());
    existingProcess.setDataCriacao(updatedProcess.getDataCriacao());
    existingProcess.setDataVencimento(updatedProcess.getDataVencimento());
    existingProcess.setResponsavel(updatedProcess.getResponsavel());
    existingProcess.setDescricao(updatedProcess.getDescricao());

    return processRepository.save(existingProcess);
  }

  @Override
  public void delete(Long id) {
    Process existingProcess = findById(id);
    processRepository.delete(existingProcess);
  }
}
