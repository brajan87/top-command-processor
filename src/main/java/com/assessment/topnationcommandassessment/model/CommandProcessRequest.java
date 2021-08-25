package com.assessment.topnationcommandassessment.model;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class CommandProcessRequest {
	
	@NonNull
	private List<StateCommand> stateCommands;
	
}
