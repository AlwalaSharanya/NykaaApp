package com.evoke.nykaaapp.dto;

public class AddressDto {
	private long Id;
	private String street;
	private String state;
	private int pincode;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "AddressDto [Id=" + Id + ", street=" + street + ", state=" + state + ", pincode=" + pincode + "]";
	}

}
