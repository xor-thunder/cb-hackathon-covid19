package com.cb.covid.pojo;

import java.util.List;

public class StateWiseCovidCases {

	private String state;
	private String statecode;
	private List<DistrictWiseCovidCases> districtData;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatecode() {
		return statecode;
	}

	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}

	public List<DistrictWiseCovidCases> getDistrictData() {
		return districtData;
	}

	public void setDistrictData(List<DistrictWiseCovidCases> districtData) {
		this.districtData = districtData;
	}

	@Override
	public String toString() {
		return "StateWiseCovidCases [state=" + state + ", statecode=" + statecode + ", districtData=" + districtData
				+ "]";
	}

}
