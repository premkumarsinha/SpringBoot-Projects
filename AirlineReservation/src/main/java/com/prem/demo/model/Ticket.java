package com.prem.demo.model;


public class Ticket {

	private int bid;
	private String name;
	private int age;
	private String airlines;
	private String date;
	private String dlocation;
	private String alocation;
	
	public Ticket()
	{
		
	}
	public Ticket(int bid,String name, int age,String airlines, String date, String dlocation,
			String alocation) {
		super();
		this.bid = bid;
		this.name = name;
		this.age = age;
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
		return "Ticket [bid=" + bid + ", name=" + name + ", age=" + age + ", airlines=" + airlines + ", date=" + date
				+ ", dlocation=" + dlocation + ", alocation=" + alocation + "]";
	}
}
