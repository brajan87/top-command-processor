package com.assessment.topnationcommandassessment.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.topnationcommandassessment.exception.StateCommandNotFoundException;
import com.assessment.topnationcommandassessment.model.Command;
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
  
  private final Map<String, List<Command>> cumulativeStateCommands;
  
  @PostMapping("/top-commands")
  public ResponseEntity<CommandProcessResponse> processTopCommand(@RequestBody CommandProcessRequest request)
      throws JsonProcessingException {

	if(request.getStateCommands().isEmpty()) {
		throw new StateCommandNotFoundException();
	}
	  
    return ResponseEntity.ok(service.getTopCommands(request, cumulativeStateCommands));
  }

}
