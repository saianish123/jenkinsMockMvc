package com.zensar.webapp.rest.contoller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {

	@Autowired//to enable autowiring for mockmvc test class must be annoted with @AutoConfigureMockMvc
	private MockMvc mock;//Mockmvc isw a class given by spring mvc to perform 
	                     //testing of spring controller.
	@Test
	public void getmessageTest() throws Exception {
		mock
			.perform(MockMvcRequestBuilders.get("/Hello"))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.content().string("Welcome to ......................."));
	}
	
	@Test
	public void createMessage() throws Exception {
		mock.perform(MockMvcRequestBuilders.post("/greet").content("Welcome"))
		.andExpect(MockMvcResultMatchers.status().isCreated())
		.andExpect(MockMvcResultMatchers.content().string("message created Welcome"));
	}
}
