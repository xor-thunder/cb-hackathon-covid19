package com.cb.covid.pojo;

public class DeltaData {

	private String confirmed;
	private String deceased;
	private String recovered;

	public String getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}

	public String getDeceased() {
		return deceased;
	}

	public void setDeceased(String deceased) {
		this.deceased = deceased;
	}

	public String getRecovered() {
		return recovered;
	}

	public void setRecovered(String recovered) {
		this.recovered = recovered;
	}

	@Override
	public String toString() {
		return "DeltaData [confirmed=" + confirmed + ", deceased=" + deceased + ", recovered=" + recovered + "]";
	}

}
