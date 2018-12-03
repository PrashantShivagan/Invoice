package com.cg.springmvctwo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




import com.cg.springmvctwo.dao.MobileDaoImpl;
import com.cg.springmvctwo.dto.Cart;
import com.cg.springmvctwo.dto.Order;



@Service("service")
@Transactional
public class MobileServiceImpl implements IMobileService{
	
	@Autowired
	MobileDaoImpl dao;

	@Override
	public List<Cart> getAllDetails() {
		// TODO Auto-generated method stub
		return dao.getAllDetails();
	}

	@Override
	public void insertOrderDetails(Order orderdetails) {
		dao.insertOrderDetails(orderdetails);
		//dao.loadTransaction(new Order());
		
	}

	@Override
	public void removeItem(int productId) {
		dao.removeItem(productId);
	}

	@Override
	public List<Order> getTransactions() {
		// TODO Auto-generated method stub

		//if(dao.getAccount(mobileNo) == null)
		//	throw new BankException("Mobile number doesn't exist");
		
		List<Order> list = null;
		
		list = dao.getTransactions();
		
		return list;
		
	}



	


	
}
