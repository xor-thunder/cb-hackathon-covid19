package com.cb.covid.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cb.covid.pojo.StateWiseCovidCasesGson;
import com.cb.covid.service.Covid19CasesService;

@CrossOrigin
@RestController
public class Covid19CasesController {

	@Autowired
	private Covid19CasesService covid19CasesService;

	@GetMapping(path="/covid19/stateWiseSummary", produces = "application/json")
	public List<StateWiseCovidCasesGson> getCovid19CasesCount() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		List<StateWiseCovidCasesGson> StateWiseCovidCasesGsonList=covid19CasesService.fetchCovidCasesData(entity);
		
		return StateWiseCovidCasesGsonList;
	}

}