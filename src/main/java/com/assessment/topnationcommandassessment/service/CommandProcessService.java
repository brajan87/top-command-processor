package com.assessment.topnationcommandassessment.service;

import java.util.List;
import java.util.Map;

import com.assessment.topnationcommandassessment.model.Command;
import com.assessment.topnationcommandassessment.model.CommandProcessRequest;
import com.assessment.topnationcommandassessment.model.CommandProcessResponse;

public interface CommandProcessService {

	CommandProcessResponse getTopCommands(CommandProcessRequest commandProcessRequest, Map<String, List<Command>> cumulativeStateCommands);

}
