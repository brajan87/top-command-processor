package com.assessment.topnationcommandassessment.model;

import java.util.List;

import lombok.Data;

@Data
public class StateCommand {
	
  private String state;
  private List<FrequentCommand> frequentCommand;

}
