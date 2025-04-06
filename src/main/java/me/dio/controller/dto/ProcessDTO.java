package me.dio.controller.dto;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public class ProcessDTO {
  @NotBlank(message = "Número do processo é obrigatório")
  private String numeroProcesso;

  @NotBlank(message = "Título é obrigatório")
  private String titulo;

  @NotBlank(message = "Gerência é obrigatória")
  private String gerencia;

  @NotBlank(message = "Status é obrigatório")
  private String status;

  @NotBlank(message = "Prioridade é obrigatória")
  private String prioridade;

  private LocalDateTime dataCriacao;
  private LocalDateTime dataVencimento;

  @NotBlank(message = "Responsável é obrigatório")
  private String responsavel;
  private String descricao;

  public String getNumeroProcesso() {
    return numeroProcesso;
  }

  public void setNumeroProcesso(String numeroProcesso) {
    this.numeroProcesso = numeroProcesso;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getGerencia() {
    return gerencia;
  }

  public void setGerencia(String gerencia) {
    this.gerencia = gerencia;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getPrioridade() {
    return prioridade;
  }

  public void setPrioridade(String prioridade) {
    this.prioridade = prioridade;
  }

  public LocalDateTime getDataCriacao() {
    return dataCriacao;
  }

  public void setDataCriacao(LocalDateTime dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  public LocalDateTime getDataVencimento() {
    return dataVencimento;
  }

  public void setDataVencimento(LocalDateTime dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  public String getResponsavel() {
    return responsavel;
  }

  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}
