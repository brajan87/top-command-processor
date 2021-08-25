package com.assessment.topnationcommandassessment.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class Command {

  private String speaker;
  @NonNull
  private String speakerCommand;

}
