package com.assessment.topnationcommandassessment.model;

import java.util.List;

import lombok.Data;

@Data
public class CommandProcessResponse {
	
	private List<StateCommand> stateCommands;
	private List<String> nationCommands;
	
}
