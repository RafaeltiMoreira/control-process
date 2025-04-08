package me.dio.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_process")
public class Process {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true)
  private String number;

  private Integer dateAttribution;
  private Integer dateExpiration;

  @Column(name = "days_limit")
  private Integer limit;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Integer getDateAttribution() {
    return dateAttribution;
  }

  public void setDateAttribution(Integer dateAttribution) {
    this.dateAttribution = dateAttribution;
  }

  public Integer getDateExpiration() {
    return dateExpiration;
  }

  public void setDateExpiration(Integer dateExpiration) {
    this.dateExpiration = dateExpiration;
  }

  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }
}
