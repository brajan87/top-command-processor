package com.ground.fedex.mockresponseserver.model;

import lombok.Data;

@Data
public class RegisterEndpointRequest {
  private String url;
  private String expectedPayload;
}
