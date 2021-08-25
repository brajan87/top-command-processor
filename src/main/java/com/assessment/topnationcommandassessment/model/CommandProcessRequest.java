package com.assessment.topnationcommandassessment.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class CommandProcessRequest {
	
	@NonNull
	private List<StateCommand> stateCommands;
	
}
