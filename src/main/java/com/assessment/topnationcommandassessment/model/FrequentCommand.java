package com.assessment.topnationcommandassessment.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class FrequentCommand {
	
	private final String startProcessTime;
	private String mostFrequentCommand;
	private String stopProcessTime;

}
