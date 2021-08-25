package com.assessment.topnationcommandassessment.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.assessment.topnationcommandassessment.model.Command;
import com.assessment.topnationcommandassessment.model.CommandProcessRequest;
import com.assessment.topnationcommandassessment.model.CommandProcessResponse;
import com.assessment.topnationcommandassessment.model.StateCommand;

@RunWith(MockitoJUnitRunner.class)
public class CommandProcessServiceImplTest{
	
	@InjectMocks private CommandProcessServiceImpl commandProcessServiceImpl;
	
	@Mock private CommandProcessRequest commandProcessRequest;
	
	@Mock private CommandProcessResponse commandProcessResponse;
	
	
	@Test
	public void testGetTopCommands() {
		commandProcessResponse = commandProcessServiceImpl.getTopCommands(getCommandProcessRequestForSuccessScenario());
		assertNotNull(commandProcessResponse);
		assertNotNull(commandProcessResponse.getStateCommands());
		assertNotNull(commandProcessResponse.getNationCommands());
		assertEquals("BBC",commandProcessResponse.getNationCommands().get(0));
	}
	
	@Test
	public void testGetTopCommandsForEmptyStateCommands() {
		CommandProcessRequest commandProcessRequest = CommandProcessRequest.builder().stateCommands(new ArrayList<StateCommand>()).build();
		commandProcessResponse = commandProcessServiceImpl.getTopCommands(commandProcessRequest);
		assertNotNull(commandProcessResponse);
		assertNotNull(commandProcessResponse.getStateCommands());
		assertNotNull(commandProcessResponse.getNationCommands());
		assertEquals(true, commandProcessResponse.getStateCommands().isEmpty());
		assertEquals(true, commandProcessResponse.getNationCommands().isEmpty());
	}
	
	private CommandProcessRequest getCommandProcessRequestForSuccessScenario() {
		Command command1 = Command.builder().speaker("John").speakerCommand("cnn").build();
		Command command2 = Command.builder().speaker("Jon").speakerCommand("BBC").build();
		List<Command> commands = new ArrayList<>() {{
			add(command1);
			add(command2);
		}};
		StateCommand stateCommand1 = StateCommand.builder().state("Florida").commands(commands).build();
		Command command3 = Command.builder().speaker("Jon").speakerCommand("bBc").build();
		commands.add(command3);
		StateCommand stateCommand2 = StateCommand.builder().state("Arizona").commands(commands).build();
		List<StateCommand> stateCommands = new ArrayList<>() {{
			add(stateCommand1);
			add(stateCommand2);
		}};
		CommandProcessRequest commandProcessRequest = CommandProcessRequest.builder().stateCommands(stateCommands).build();
		return commandProcessRequest;
	}

}
