package me.dio.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @OneToOne(cascade = CascadeType.ALL)
  private Process process;

  @OneToOne(cascade = CascadeType.ALL)
  private Management management;

  @OneToOne(cascade = CascadeType.ALL)
  private Type type;

  @OneToOne(cascade = CascadeType.ALL)
  private Priority priority;

  @OneToOne(cascade = CascadeType.ALL)
  private Time time;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Process getProcess() {
    return process;
  }

  public void setProcess(Process process) {
    this.process = process;
  }

  public Management getManagement() {
    return management;
  }

  public void setManagement(Management management) {
    this.management = management;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public Priority getPriority() {
    return priority;
  }

  public void setPriority(Priority priority) {
    this.priority = priority;
  }

  public Time getTime() {
    return time;
  }

  public void setTime(Time time) {
    this.time = time;
  }
}
