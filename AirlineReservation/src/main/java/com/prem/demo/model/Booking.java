package com.prem.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bid;
	private int pid;
	private String name;
	private int age;
	private int fid;
	private String airlines;
	private String date;
	private String dlocation;
	private String alocation;
	
	public Booking() {
		super();
	}
	public Booking(int pid, String name, int age, int fid, String airlines, String date, String dlocation,
			String alocation) {
		super();
		
		this.pid = pid;
		this.name = name;
		this.age = age;
		this.fid = fid;
		this.airlines = airlines;
		this.date = date;
		this.dlocation = dlocation;
		this.alocation = alocation;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
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
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDlocation() {
		return dlocation;
	}
	public void setDlocation(String dlocation) {
		this.dlocation = dlocation;
	}
	public String getAlocation() {
		return alocation;
	}
	public void setAlocation(String alocation) {
		this.alocation = alocation;
	}
	@Override
	public String toString() {
		return "Booking [bid=" + bid + ", pid=" + pid + ", name=" + name + ", age=" + age + ", fid=" + fid
				+ ", airlines=" + airlines + ", date=" + date + ", dlocation=" + dlocation + ", alocation=" + alocation
				+ "]";
	}
	
	
	
	

}
