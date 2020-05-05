package com.cb.covid.pojo;

public class DistrictWiseCovidCases {

	private String district;
	private String notes;
	private int active;
	private int confirmed;
	private int deceased;
	private int recovered;

	public int getActive() {
		return active;
	}

	public int getConfirmed() {
		return confirmed;
	}

	public int getDeceased() {
		return deceased;
	}

	public int getRecovered() {
		return recovered;
	}

	public String getDistrict() {
		return district;
	}

}
