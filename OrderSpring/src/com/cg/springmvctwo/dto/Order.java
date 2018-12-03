
package com.cg.springmvctwo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDERS")
public class Order {
		
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="ORDER_ID")
		Integer orderId;
		
		@Column(name="PRODUCT_NAME")
		String productName;
		
		@Column(name="QUANTITY")
		Integer quantity;
		
		@Column(name="TOTAL_PRICE")
		Double totalPrice;
		
		@Column(name="USER_ID")
		String userId;
		
		@Column(name="PURCHASE_DATE")
		String purchaseDate;

		public Order()
		{
			
		}

		
		
		public Order(Integer orderId, String productName, Integer quantity,
				Double totalPrice, String userId, String purchaseDate) {
			super();
			this.orderId = orderId;
			this.productName = productName;
			this.quantity = quantity;
			this.totalPrice = totalPrice;
			this.userId = userId;
			this.purchaseDate = purchaseDate;
		}



		//Getters and Setters
		public Integer getOrderId() {
			return orderId;
		}

		public void setOrderId(Integer orderId) {
			this.orderId = orderId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public Integer getQuantity() {
			return quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public Double getTotalPrice() {
			return totalPrice;
		}

		public void setTotalPrice(Double totalPrice) {
			this.totalPrice = totalPrice;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getPurchaseDate() {
			return purchaseDate;
		}

		public void setPurchaseDate(String purchaseDate) {
			this.purchaseDate = purchaseDate;
		}
		
		

}
