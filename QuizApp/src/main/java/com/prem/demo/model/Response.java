package com.prem.demo.model;

public class Response {

	private int rid;
	private String value;
	
	public Response(int rid, String value) {
		
		this.rid = rid;
		this.value = value;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Response [rid=" + rid + ", value=" + value + "]";
	}
	
}
