package com.assessment.topnationcommandassessment.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ground.fedex.mockresponseserver.model.RegisterEndpointRequest;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/mockServer")
@RequiredArgsConstructor
public class CommandProcessor {

  private final HashMap<String, RegisterEndpointRequest> responseCollection;

  @PostMapping("/register")
  public void registerNewEndpoint(@NonNull @RequestBody RegisterEndpointRequest request) {
    responseCollection.put(request.getUrl(), request);
  }

}
