package com.cg.springmvctwo.dao;

import java.util.List;


import com.cg.springmvctwo.dto.Cart;
import com.cg.springmvctwo.dto.Order;


public interface IMobileDao {
	public List<Cart> getAllDetails();
	
	public void insertOrderDetails( Order orderdetails);
	
	public void removeItem(int productId);
	
	public List<Order> getTransactions();
	public void loadTransaction(Order pt);
}
