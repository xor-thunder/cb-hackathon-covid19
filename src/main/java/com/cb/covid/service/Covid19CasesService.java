package com.cb.covid.service;

import java.util.List;

import org.springframework.http.HttpEntity;

import com.cb.covid.pojo.StateWiseCovidCasesGson;

public interface Covid19CasesService {
	
	public List<StateWiseCovidCasesGson> fetchCovidCasesData(HttpEntity<String> entity);

}
