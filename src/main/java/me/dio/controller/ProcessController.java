package me.dio.controller;

import me.dio.domain.model.Process;
import me.dio.service.ProcessService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/processes")
public class ProcessController {

  private final ProcessService processService;

  public ProcessController(ProcessService processService) {
    this.processService = processService;
  }

  @GetMapping("/{id}")
  public ResponseEntity<Process> findById(@PathVariable Long id) {
    var process = processService.findById(id);
    return ResponseEntity.ok(process);
  }

  @GetMapping
  public ResponseEntity<List<Process>> findByStatusOrResponsavel(
          @RequestParam(required = false) String status,
          @RequestParam(required = false) String responsavel) {

    if (status != null) {
      return ResponseEntity.ok(processService.findByStatus(status));
    } else if (responsavel != null) {
      return ResponseEntity.ok(processService.findByResponsavel(responsavel));
    }

    return ResponseEntity.badRequest().build();
  }

  @PostMapping
  public ResponseEntity<Process> create(@RequestBody Process processToCreate) {
    var createdProcess = processService.create(processToCreate);
    URI location = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(createdProcess.getId())
            .toUri();
    return ResponseEntity.created(location).body(createdProcess);
  }
}
