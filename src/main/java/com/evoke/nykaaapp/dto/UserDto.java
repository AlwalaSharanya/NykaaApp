package com.evoke.nykaaapp.dto;

import java.util.List;

public class UserDto {
	
	private Long id;
    private String name;
    private String email;
    private long phonenumber;
	private List<AddressDto> addressDto;
	private CartDto cartdto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public CartDto getCartdto() {
		return cartdto;
	}

	public void setCartdto(CartDto cartdto) {
		this.cartdto = cartdto;
	}

	@Override
	public String toString() {
		return "PersonDto [id=" + id + ", name=" + name + ", email=" + email + ", phonenumber=" + phonenumber
				+ ", cartdto=" + cartdto + "]";
	}

//	private Long id;
//	private String personname;
//	private String email;
//	private double mobileno;
//	//private CartDto cartdto;
//	
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getPersonname() {
//		return personname;
//	}
//
//	public void setPersonname(String personname) {
//		this.personname = personname;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public double getMobileno() {
//		return mobileno;
//	}
//
//	public void setMobileno(double mobileno) {
//		this.mobileno = mobileno;
//	}
//
//	@Override
//	public String toString() {
//		return "PersonDto [id=" + id + ", personname=" + personname + ", email=" + email + ", mobileno=" + mobileno
//				+ "]";
//	}

//	public CartDto getCartdto() {
//		return cartdto;
//	}
//
//	public void setCartdto(CartDto cartdto) {
//		this.cartdto = cartdto;
//	}
}
