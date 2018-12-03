package com.cg.springmvctwo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;



import com.cg.springmvctwo.dto.Cart;
import com.cg.springmvctwo.dto.Order;


@Repository("dao")
public class MobileDaoImpl implements IMobileDao{
	
	@PersistenceContext
	EntityManager em;

	@Override
	public List<Cart> getAllDetails() {
		// TODO Auto-generated method stub
		
		Query queryGet=em.createQuery("FROM Cart");
		List<Cart> myList=queryGet.getResultList();
		return myList;
	}

	@Override
	public void insertOrderDetails(Order orderdetails) {
		em.persist(orderdetails);
		em.flush();
	}

	@Override
	public void removeItem(int productId) {
		
		Query queryRemove = em.createQuery("DELETE FROM Cart WHERE product_id=:mobdata");
		queryRemove.setParameter("mobdata", productId);
		queryRemove.executeUpdate();
	}

	@Override
	public List<Order> getTransactions() {
		// TODO Auto-generated method stub
		List<Order> tranList = null;
		Query query = em.createQuery("From Cart ");
		tranList = query.getResultList();
		return tranList;
		
	}

	@Override
	public void loadTransaction(Order pt) {
		// TODO Auto-generated method stub
		em.persist(pt);
	}
}
