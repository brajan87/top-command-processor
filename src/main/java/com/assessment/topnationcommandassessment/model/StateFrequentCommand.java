package com.assessment.topnationcommandassessment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StateFrequentCommand {
	
	private String state;
	private FrequentCommand frequentCommand;

}
