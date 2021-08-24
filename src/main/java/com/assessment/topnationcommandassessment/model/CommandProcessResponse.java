package com.assessment.topnationcommandassessment.model;

import java.util.List;

import lombok.Data;

@Data
public class CommandProcessResponse {
	
	private List<FrequentCommand> stateCommands;
	private List<String> nationCommands;
	
}
