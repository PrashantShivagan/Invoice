package com.cg.springmvctwo.service;

import java.util.List;

import com.cg.springmvctwo.dto.Cart;
import com.cg.springmvctwo.dto.Order;




public interface IMobileService {
	
	public List<Cart> getAllDetails();

	public void insertOrderDetails(Order orderdetails);

	public void removeItem(int productId);
	
	public List<Order> getTransactions();
	
}
