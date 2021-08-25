package com.assessment.topnationcommandassessment.model;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class StateCommand {
  
  @NonNull
  private String state;
  @NonNull
  private List<Command> commands;

}
