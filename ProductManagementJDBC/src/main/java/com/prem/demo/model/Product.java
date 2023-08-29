package com.prem.demo.model;




public class Product {
	
	
	private int pid;
	private String name;
	private String type;
	private String place;
	private int warranty;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", type=" + type + ", place=" + place + ", warranty="
				+ warranty + "]";
	}
}
