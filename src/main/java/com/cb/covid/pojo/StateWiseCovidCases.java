package com.cb.covid.pojo;

import java.util.List;

public class StateWiseCovidCases {

	private String state;
	private String statecode;
	private List<DistrictWiseCovidCases> districtData;

	public String getState() {
		return state;
	}

	public List<DistrictWiseCovidCases> getDistrictData() {
		return districtData;
	}

}
