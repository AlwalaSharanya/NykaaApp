package com.evoke.nykaaapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "person_details")

public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "ph_number")
	private long phonenumber;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "person_cart_id", referencedColumnName = "id")
	private CartEntity cartEntity;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "id")

	private AddressEntity addressEntity;

	public AddressEntity getAddressEntity() {
		return addressEntity;
	}

	public void setAddressEntity(AddressEntity addressEntity) {
		this.addressEntity = addressEntity;
	}

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

	public CartEntity getCartEntity() {
		return cartEntity;
	}

	public void setCartEntity(CartEntity cartEntity) {
		this.cartEntity = cartEntity;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", email=" + email + ", phonenumber=" + phonenumber
				+ ", cartEntity=" + cartEntity + ", addressEntity=" + addressEntity + "]";
	}

//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long id;
//
//	@Column(name = "personname")
//	private String personname;
//	@Column(name = "email")
//	private String email;
//	@Column(name = "mobileno")
//	private double mobileno;
//
////	@OneToOne(cascade = CascadeType.ALL)
////	@JoinColumn(name = "cart_id", referencedColumnName = "id")
//	//private CartEntity cart;
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
//
//	}

//	public CartEntity getCart() {
//		return cart;
//	}
//
//	public void setCart(CartEntity cart) {
//		this.cart = cart;
}
