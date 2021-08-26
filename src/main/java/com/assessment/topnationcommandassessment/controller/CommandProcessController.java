package com.assessment.topnationcommandassessment.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.topnationcommandassessment.model.CommandProcessRequest;
import com.assessment.topnationcommandassessment.model.CommandProcessResponse;
import com.assessment.topnationcommandassessment.service.CommandProcessService;
import com.fasterxml.jackson.core.JsonProcessingException;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/command")
@RequiredArgsConstructor
public class CommandProcessController {

  private final CommandProcessService service;
  
  @PostMapping("/top-commands")
  public ResponseEntity<CommandProcessResponse> processCommand(@RequestBody CommandProcessRequest request)
      throws JsonProcessingException {

    return ResponseEntity.ok(service.getTopCommands(request));
  }

}
