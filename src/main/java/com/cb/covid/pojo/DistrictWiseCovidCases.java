package com.cb.covid.pojo;

public class DistrictWiseCovidCases {

	private String district;
	private String notes;
	private int active;
	private int confirmed;
	private int deceased;
	private int recovered;
	private DeltaData delta;

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public int getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}

	public int getDeceased() {
		return deceased;
	}

	public void setDeceased(int deceased) {
		this.deceased = deceased;
	}

	public int getRecovered() {
		return recovered;
	}

	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}


	public DeltaData getDelta() {
		return delta;
	}

	public void setDelta(DeltaData delta) {
		this.delta = delta;
	}

	@Override
	public String toString() {
		return "DistrictWiseCovidCases [district=" + district + ", notes=" + notes + ", active=" + active
				+ ", confirmed=" + confirmed + ", deceased=" + deceased + ", recovered=" + recovered + ", delta="
				+ delta + "]";
	}

}
