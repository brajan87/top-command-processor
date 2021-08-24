package com.assessment.topnationcommandassessment.service.impl;

import java.time.Clock;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.assessment.topnationcommandassessment.model.Command;
import com.assessment.topnationcommandassessment.model.CommandProcessRequest;
import com.assessment.topnationcommandassessment.model.CommandProcessResponse;
import com.assessment.topnationcommandassessment.model.FrequentCommand;
import com.assessment.topnationcommandassessment.model.StateCommand;
import com.assessment.topnationcommandassessment.service.CommandProcessService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommandProcessServiceImpl implements CommandProcessService{
	
	@Override
	public CommandProcessResponse getTopCommands(CommandProcessRequest commandProcessRequest) {
		HashMap<String, Integer> commandTracker;
		CommandProcessResponse commandProcessResponse = new CommandProcessResponse();
		List<FrequentCommand> frequentCommands = new ArrayList<>();
		List<StateCommand> stateCommands = commandProcessRequest.getStateCommands();
		for(StateCommand stateCommand : stateCommands) {
			commandTracker = new HashMap<>();
			FrequentCommand frequentCommand = new FrequentCommand();
			frequentCommand.setStartProcessTime(String.valueOf(Clock.systemDefaultZone().millis()));
			List<String> topCommand = new ArrayList<>();
			for(Command command : stateCommand.getCommands()) {
				commandTracker.put(command.getSpeakerCommand(), commandTracker.getOrDefault(command.getSpeakerCommand(), 0)+1);
			}
			commandTracker.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> topCommand.add(x.getKey()));
			frequentCommand.setMostFrequentCommand(topCommand.get(0));
			frequentCommand.setStopProcessTime(String.valueOf(Clock.systemDefaultZone().millis()));
			frequentCommands.add(frequentCommand);
		}
		commandProcessResponse.setStateCommands(frequentCommands);
	
		return commandProcessResponse;
	}


}
