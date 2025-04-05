package me.dio.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_process_data")
public class ProcessData {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private List<Process> processos;

  @OneToOne(cascade = CascadeType.ALL)
  private AvailableOptions opcoesDisponiveis;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public List<Process> getProcessos() {
    return processos;
  }

  public void setProcessos(List<Process> processos) {
    this.processos = processos;
  }

  public AvailableOptions getOpcoesDisponiveis() {
    return opcoesDisponiveis;
  }

  public void setOpcoesDisponiveis(AvailableOptions opcoesDisponiveis) {
    this.opcoesDisponiveis = opcoesDisponiveis;
  }
}
