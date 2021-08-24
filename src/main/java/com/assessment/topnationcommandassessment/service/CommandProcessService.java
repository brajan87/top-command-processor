package com.assessment.topnationcommandassessment.service;

import com.assessment.topnationcommandassessment.model.CommandProcessRequest;
import com.assessment.topnationcommandassessment.model.CommandProcessResponse;

public interface CommandProcessService {

	CommandProcessResponse getTopCommands(CommandProcessRequest commandProcessRequest);

}
