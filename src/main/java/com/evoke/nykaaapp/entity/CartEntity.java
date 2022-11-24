package com.evoke.nykaaapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cart_items")
public class CartEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "itemName")
	private String itemName;
	@Column(name = "itemCost")
	private int itemCost;
	@Column(name = "quantity")
	private int quantity;

	@OneToOne(mappedBy = "cartEntity")
	private UserEntity UserEntity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemCost() {
		return itemCost;
	}

	public void setItemCost(int itemCost) {
		this.itemCost = itemCost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public UserEntity getUserEntity() {
		return UserEntity;
	}

	public void setUserEntity(UserEntity UserEntity) {
		this.UserEntity = UserEntity;
	}

	@Override
	public String toString() {
		return "CartEntity [id=" + id + ", itemName=" + itemName + ", itemCost=" + itemCost + ", quantity=" + quantity
				+ ", UserEntity=" + UserEntity + "]";
	}

}
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "cart_table")
//public class CartEntity {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long id;
//
//	@Column(name = "quantity")
//	private int quantity;
//
//	@OneToOne(mappedBy = "cart")
//	private CartEntity cartt;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public int getQuantity() {
//		return quantity;
//	}
//
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//
//	public CartEntity getCartt() {
//		return cartt;
//	}
//
//	public void setCart(CartEntity cartt) {
//		this.cartt = cartt;
//	}
//
//	@Override
//	public String toString() {
//		return "CartEntity [id=" + id + ", quantity=" + quantity + ", cart=" + cartt + "]";
//	}
//	
//	
//}
