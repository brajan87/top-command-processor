package com.assessment.topnationcommandassessment.model;

import java.util.List;

import lombok.Data;

@Data
public class CommandProcessRequest {
	
	private List<StateCommand> stateCommands;
	
}
