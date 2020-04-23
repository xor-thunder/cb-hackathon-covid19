package com.cb.covid.pojo;

import java.util.List;

public class StateWiseCovidCasesGson {

	private String states;
	private int confirmed;
	private int active;
	private int recovered;
	private int deceased;
	private List<DistrictWiseCovidCasesGson> subtasks;

	public String getStates() {
		return states;
	}

	public void setStates(String states) {
		this.states = states;
	}

	public int getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public int getRecovered() {
		return recovered;
	}

	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}

	public int getDeceased() {
		return deceased;
	}

	public void setDeceased(int deceased) {
		this.deceased = deceased;
	}

	public List<DistrictWiseCovidCasesGson> getSubtasks() {
		return subtasks;
	}

	public void setSubtasks(List<DistrictWiseCovidCasesGson> subtasks) {
		this.subtasks = subtasks;
	}

	@Override
	public String toString() {
		return "StateWiseCovidCasesGson [states=" + states + ", confirmed=" + confirmed + ", active=" + active
				+ ", recovered=" + recovered + ", deceased=" + deceased + ", subtasks=" + subtasks + "]";
	}

}
