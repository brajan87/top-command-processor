package com.assessment.topnationcommandassessment.controller;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.assessment.topnationcommandassessment.service.CommandProcessService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(value = CommandProcessController.class, properties = "spring.main.lazy-initialization=true")
public class CommandProcessControllerTest {
	
	private AutoCloseable closeable;

    @Before public void openMocks() {
    	closeable = MockitoAnnotations.openMocks(this);
    }

    @After public void releaseMocks() throws Exception {
        closeable.close();
    }
	
    @InjectMocks
    private CommandProcessController commandProcessController;
    
	@Autowired
	private MockMvc mockMvc;

	@Mock
	private CommandProcessService commandProcessService;
	
	@Test
	public void testGetTopCommandControllerForSuccess() throws Exception {
		String request = "{\"stateCommands\":[{\"state\":\"alabama\",\"commands\":[{\"speaker\":\"Fred Zhang\",\"speakerCommand\":\"CNN\"},{\"speaker\":\"Fred Zhang\",\"speakerCommand\":\"NBC\"},{\"speaker\":\"Fred Zhang\",\"speakerCommand\":\"CNN\"}]},"
				+ "{\"state\":\"Florida\",\"commands\":[{\"speaker\":\"Thomas Brown\",\"speakerCommand\":\"Show me movies\"},{\"speaker\":\"Alisha Brown\",\"speakerCommand\":\"Stranger Things\"},{\"speaker\":\"Marcus Brown\",\"speakerCommand\":\"Game of Thrones\"},{\"speaker\":\"Missy Brown\",\"speakerCommand\":\"Turn off the TV\"},{\"speaker\":\"Missy Brown\",\"speakerCommand\":\"Turn off the TV\"}]},"
				+ "{\"state\":\"maryland\",\"commands\":[{\"speaker\":\"Thomas Black\",\"speakerCommand\":\"Show me comedies\"},{\"speaker\":\"Alisa Black\",\"speakerCommand\":\"Game of thrones\"},{\"speaker\":\"Marcus Black\",\"speakerCommand\":\"game of thrones\"},{\"speaker\":\"Missy Black\",\"speakerCommand\":\"game OF thrones\"},{\"speaker\":\"Missy Black\",\"speakerCommand\":\"turn off the TV\"}]}]}";
		RequestBuilder requestBuilder = (RequestBuilder) MockMvcRequestBuilders.post("/command/top-commands").accept(MediaType.APPLICATION_JSON).content(request).contentType(MediaType.APPLICATION_JSON);
		MvcResult mvcResult;
		mvcResult = mockMvc.perform(requestBuilder).andReturn();
		MockHttpServletResponse response = mvcResult.getResponse();
		assertEquals(200, response.getStatus());
		assertNotNull(response);
	}
	
	@Test
	public void testGetTopCommandControllerWithEmptySpeakerCommand() throws Exception {
		String request = "{\"stateCommands\":[{\"state\":\"alabama\",\"commands\":[{\"speaker\":\"Fred Zhang\",\"speakerCommand\":null},{\"speaker\":\"Fred Zhang\",\"speakerCommand\":\"NBC\"},{\"speaker\":\"Fred Zhang\",\"speakerCommand\":\"CNN\"}]},"
				+ "{\"state\":\"Florida\",\"commands\":[{\"speaker\":\"Thomas Brown\",\"speakerCommand\":\"Show me movies\"},{\"speaker\":\"Alisha Brown\",\"speakerCommand\":\"Stranger Things\"},{\"speaker\":\"Marcus Brown\",\"speakerCommand\":\"Game of Thrones\"},{\"speaker\":\"Missy Brown\",\"speakerCommand\":\"Turn off the TV\"},{\"speaker\":\"Missy Brown\",\"speakerCommand\":\"Turn off the TV\"}]},"
				+ "{\"state\":\"maryland\",\"commands\":[{\"speaker\":\"Thomas Black\",\"speakerCommand\":\"Show me comedies\"},{\"speaker\":\"Alisa Black\",\"speakerCommand\":\"Game of thrones\"},{\"speaker\":\"Marcus Black\",\"speakerCommand\":\"game of thrones\"},{\"speaker\":\"Missy Black\",\"speakerCommand\":\"game OF thrones\"},{\"speaker\":\"Missy Black\",\"speakerCommand\":\"turn off the TV\"}]}]}";
		RequestBuilder requestBuilder = (RequestBuilder) MockMvcRequestBuilders.post("/command/top-commands").accept(MediaType.APPLICATION_JSON).content(request).contentType(MediaType.APPLICATION_JSON);
		MvcResult mvcResult;
		mvcResult = mockMvc.perform(requestBuilder).andReturn();
		MockHttpServletResponse response = mvcResult.getResponse();
		assertEquals(400, response.getStatus());
		assertNotNull(response);
	}
	
	@Test
	public void testGetTopCommandControllerWithEmptyStateName() throws Exception {
		String request = "{\"stateCommands\":[{\"state\":null,\"commands\":[{\"speaker\":\"Fred Zhang\",\"speakerCommand\":null},{\"speaker\":\"Fred Zhang\",\"speakerCommand\":\"NBC\"},{\"speaker\":\"Fred Zhang\",\"speakerCommand\":\"CNN\"}]},"
				+ "{\"state\":\"Florida\",\"commands\":[{\"speaker\":\"Thomas Brown\",\"speakerCommand\":\"Show me movies\"},{\"speaker\":\"Alisha Brown\",\"speakerCommand\":\"Stranger Things\"},{\"speaker\":\"Marcus Brown\",\"speakerCommand\":\"Game of Thrones\"},{\"speaker\":\"Missy Brown\",\"speakerCommand\":\"Turn off the TV\"},{\"speaker\":\"Missy Brown\",\"speakerCommand\":\"Turn off the TV\"}]},"
				+ "{\"state\":\"maryland\",\"commands\":[{\"speaker\":\"Thomas Black\",\"speakerCommand\":\"Show me comedies\"},{\"speaker\":\"Alisa Black\",\"speakerCommand\":\"Game of thrones\"},{\"speaker\":\"Marcus Black\",\"speakerCommand\":\"game of thrones\"},{\"speaker\":\"Missy Black\",\"speakerCommand\":\"game OF thrones\"},{\"speaker\":\"Missy Black\",\"speakerCommand\":\"turn off the TV\"}]}]}";
		RequestBuilder requestBuilder = (RequestBuilder) MockMvcRequestBuilders.post("/command/top-commands").accept(MediaType.APPLICATION_JSON).content(request).contentType(MediaType.APPLICATION_JSON);
		MvcResult mvcResult;
		mvcResult = mockMvc.perform(requestBuilder).andReturn();
		MockHttpServletResponse response = mvcResult.getResponse();
		assertEquals(400, response.getStatus());
		assertNotNull(response);
	}
	
}
