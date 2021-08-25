package com.assessment.topnationcommandassessment.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Command {

  private String speaker;
  @NonNull
  private String speakerCommand;

}
