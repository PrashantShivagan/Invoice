package com.cg.springmvctwo.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CART")
public class Cart {
	
	@Id
	@Column(name="PRODUCT_ID")
	Integer product_id;
	
	@Column(name="PRODUCT_NAME")
	String product_name;
	
	@Column(name="PRODUCT_PRICE")
	Integer product_price;
	
	@Column(name="USER_ID")
	String user_id;

	//default constructor
	public Cart() {
	
	}

	
	//Getters and Setters
	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	
	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Integer getProduct_price() {
		return product_price;
	}

	public void setProduct_price(Integer product_price) {
		this.product_price = product_price;
	}

	

	public String getUser_id() {
		return user_id;
	}


	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}


	@Override
	public String toString() {
		return "Cart [product_id=" + product_id + ", product_name="
				+ product_name + ", product_price=" + product_price
				+ ", user_id=" + user_id + "]";
	}


	
	
	
}
