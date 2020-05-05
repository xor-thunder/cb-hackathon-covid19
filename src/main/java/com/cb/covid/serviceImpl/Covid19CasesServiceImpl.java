package com.cb.covid.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cb.covid.pojo.CovidCasesCount;
import com.cb.covid.pojo.DistrictWiseCovidCases;
import com.cb.covid.pojo.DistrictWiseCovidCasesGson;
import com.cb.covid.pojo.StateWiseCovidCases;
import com.cb.covid.pojo.StateWiseCovidCasesGson;
import com.google.gson.Gson;

@Service
public class Covid19CasesServiceImpl implements com.cb.covid.service.Covid19CasesService {

	@Autowired
	RestTemplate restTemplate;

	@Override
	public List<StateWiseCovidCasesGson> fetchCovidCasesData(HttpEntity<String> entity) {

		String responeData = restTemplate.exchange("https://api.covid19india.org/v2/state_district_wise.json",
				HttpMethod.GET, entity, String.class).getBody();

		Gson gson = new Gson();
		String responseListData = "{\"stateWiseCovidCasesList\":" + responeData + "}";
		CovidCasesCount covidCasesCount = gson.fromJson(responseListData, CovidCasesCount.class);
		List<StateWiseCovidCasesGson> stateWiseCovidCasesGsonList = convertGsonObject(covidCasesCount, gson);

		return stateWiseCovidCasesGsonList;
	}

	public static List<StateWiseCovidCasesGson> convertGsonObject(CovidCasesCount covidCasesCount, Gson gson) {
		List<StateWiseCovidCases> stateWiseCovidCasesList = covidCasesCount.getStateWiseCovidCasesList();

		List<StateWiseCovidCasesGson> stateWiseCovidCasesGsonList = new ArrayList();

		for (StateWiseCovidCases stateWiseCovidCases : stateWiseCovidCasesList) {
			int activeCount = 0;
			int confirmedCount = 0;
			int deceasedCount = 0;
			int recoveredCount = 0;
			StateWiseCovidCasesGson stateWiseCovidCasesGson = new StateWiseCovidCasesGson();
			List<DistrictWiseCovidCasesGson> districtWiseCovidCasesGsonList = new ArrayList<>();

			List<DistrictWiseCovidCases> districtWiseCovidCasesList = stateWiseCovidCases.getDistrictData();
			for (DistrictWiseCovidCases districtWiseCovidCases : districtWiseCovidCasesList) {
				DistrictWiseCovidCasesGson districtWiseCovidCasesGson = new DistrictWiseCovidCasesGson();
				activeCount = activeCount + districtWiseCovidCases.getActive();
				confirmedCount = confirmedCount + districtWiseCovidCases.getConfirmed();
				deceasedCount = deceasedCount + districtWiseCovidCases.getDeceased();
				recoveredCount = recoveredCount + districtWiseCovidCases.getRecovered();

				districtWiseCovidCasesGson.setStates(districtWiseCovidCases.getDistrict());
				districtWiseCovidCasesGson.setConfirmed(districtWiseCovidCases.getConfirmed());
				districtWiseCovidCasesGson.setActive(districtWiseCovidCases.getActive());
				districtWiseCovidCasesGson.setRecovered(districtWiseCovidCases.getRecovered());
				districtWiseCovidCasesGson.setDeceased(districtWiseCovidCases.getDeceased());
				districtWiseCovidCasesGsonList.add(districtWiseCovidCasesGson);
				districtWiseCovidCasesGson = null;
			}
			stateWiseCovidCasesGson.setStates(stateWiseCovidCases.getState());
			stateWiseCovidCasesGson.setConfirmed(confirmedCount);
			stateWiseCovidCasesGson.setActive(activeCount);
			stateWiseCovidCasesGson.setRecovered(recoveredCount);
			stateWiseCovidCasesGson.setDeceased(deceasedCount);
			stateWiseCovidCasesGson.setSubtasks(districtWiseCovidCasesGsonList);
			stateWiseCovidCasesGsonList.add(stateWiseCovidCasesGson);
			stateWiseCovidCasesGson = null;
			districtWiseCovidCasesGsonList = null;
			districtWiseCovidCasesList = null;
		}
		// String jsonInString = gson.toJson(stateWiseCovidCasesGsonList);

		return stateWiseCovidCasesGsonList;
	}

}
