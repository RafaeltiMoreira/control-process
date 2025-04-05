package me.dio.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_available_options")
public class AvailableOptions {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ElementCollection
  private List<String> titulos;

  @ElementCollection
  private List<String> gerencias;

  @ElementCollection
  private List<String> status;

  @ElementCollection
  private List<String> prioridades;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public List<String> getTitulos() {
    return titulos;
  }

  public void setTitulos(List<String> titulos) {
    this.titulos = titulos;
  }

  public List<String> getGerencias() {
    return gerencias;
  }

  public void setGerencias(List<String> gerencias) {
    this.gerencias = gerencias;
  }

  public List<String> getStatus() {
    return status;
  }

  public void setStatus(List<String> status) {
    this.status = status;
  }

  public List<String> getPrioridades() {
    return prioridades;
  }

  public void setPrioridades(List<String> prioridades) {
    this.prioridades = prioridades;
  }
}
