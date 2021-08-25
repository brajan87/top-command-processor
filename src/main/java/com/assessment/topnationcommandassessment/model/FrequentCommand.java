package com.assessment.topnationcommandassessment.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class FrequentCommand {
	
	private String mostFrequentCommand;
	private final String startProcessTime;
	private String stopProcessTime;

}
