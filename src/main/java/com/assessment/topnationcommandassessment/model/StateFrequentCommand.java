package com.assessment.topnationcommandassessment.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StateFrequentCommand {
	
	private String state;
	private FrequentCommand frequentCommand;

}
