package com.prem.demo.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Flights {
	
	@Id
	private int fid;
	private String airlines;
	private String fdate;
	private String dlocation;
	private String alocation;
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getAirlines() {
		return airlines;
	}
	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}
	public String getDate() {
		return fdate;
	}
	public void setDate(String date) {
		this.fdate = date;
	}
	public String getDlocation() {
		return dlocation;
	}
	public void setDlocation(String dloaction) {
		this.dlocation = dloaction;
	}
	public String getAlocation() {
		return alocation;
	}
	public void setAlocation(String alocation) {
		this.alocation = alocation;
	}
	@Override
	public String toString() {
		return "Flights [fid=" + fid + ", airlines=" + airlines + ", date=" + fdate + ", dlocation=" + dlocation
				+ ", alocation=" + alocation + "]";
	}
	

}
