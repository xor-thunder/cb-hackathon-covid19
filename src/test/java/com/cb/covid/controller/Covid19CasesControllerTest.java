package com.cb.covid.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class Covid19CasesControllerTest {
	protected MockMvc mvc;
	   @Autowired
	   WebApplicationContext webApplicationContext;

	@BeforeEach
	public void setUp() {
		 mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	   }
	

	@Test
	public void testGetCovid19CasesCount() {
		
			   String uri = "/covid19/stateWiseSummary";
			   MvcResult mvcResult = null;
			try {
				mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
				      .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   
			   int status = mvcResult.getResponse().getStatus();
			   assertEquals(200, status);
			   try {
				String content = mvcResult.getResponse().getContentAsString();
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   
			  
			}
	}

