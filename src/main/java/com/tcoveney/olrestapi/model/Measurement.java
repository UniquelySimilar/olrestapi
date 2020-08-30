package com.tcoveney.olrestapi.model;

public class Measurement {
	private int id;
	private int value;
	private String uom;
	
	public Measurement(int id, int value) {
		this.id = id;
		this.value = value;
		this.uom = "ft2";
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getUom() {
		return uom;
	}
	
	public void setUom(String uom) {
		this.uom = uom;
	}

	@Override
	public String toString() {
		return "Measurement [id=" + id + ", value=" + value + ", uom=" + uom + "]";
	}
}
