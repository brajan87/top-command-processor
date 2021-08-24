package com.assessment.topnationcommandassessment.controller;

import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.topnationcommandassessment.model.CommandProcessRequest;
import com.assessment.topnationcommandassessment.model.CommandProcessResponse;
import com.assessment.topnationcommandassessment.service.CommandProcessService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.ground.fedex.mockresponseserver.model.RegisterEndpointRequest;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/command")
@RequiredArgsConstructor
public class CommandProcessController {

  private final CommandProcessService service;
  private final HashMap<String, RegisterEndpointRequest> responseCollection;

  @PostMapping("/register")
  public void registerNewEndpoint(@NonNull @RequestBody RegisterEndpointRequest request) {
    responseCollection.put(request.getUrl(), request);
  }
  
  @PostMapping("/top-commands")
  public ResponseEntity<CommandProcessResponse> runItinerary(@RequestBody CommandProcessRequest request)
      throws JsonProcessingException {

    return ResponseEntity.ok(service.getTopCommands(request));
  }

}
