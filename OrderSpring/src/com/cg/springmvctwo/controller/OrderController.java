package com.cg.springmvctwo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmvctwo.dto.Cart;
import com.cg.springmvctwo.dto.Order;
import com.cg.springmvctwo.service.IMobileService;


@Controller
public class OrderController {
	
	
	@Autowired
	IMobileService service;
	
	@RequestMapping(value="showcart", method=RequestMethod.GET)
	public ModelAndView getCartDetails()
	{
		List<Cart> mobData=service.getAllDetails();
		return new ModelAndView("cartshow","data",mobData);
		
	}
	

	@RequestMapping(value="orderpage", method=RequestMethod.POST)
	public String getOrderPage(@ModelAttribute("my") Order orderdetails)
	{
		service.insertOrderDetails(orderdetails);
		return "orderConfirm";
		
	}
	
	@RequestMapping(value="removeItem/{id}", method=RequestMethod.GET)
	public String removeFromCart(@PathVariable("id")int id,Cart cart)
	{
		service.removeItem(id);
		return "cartshow1";
		
		
	}
	
	
	@RequestMapping(value = "removeItem")
	public String print(@ModelAttribute("rem") Order oc) {
		return "cartshow";
	}
	
	@RequestMapping(value = "removeItem", method = RequestMethod.POST)
	public ModelAndView printNow(@ModelAttribute("rem") Order oc) {
		String res = null;
		List<Order> list = null;
			list = service.getTransactions();
	
		return new ModelAndView("Transaction", "result", list);
	}
	
	
//	@RequestMapping(value="purchase", method=RequestMethod.GET)
//	public ModelAndView dataDisplay(@RequestParam("mobname") String mname)
//	{
//		
//		return new ModelAndView("purchasedetail","ename",mname);
//		
//	}

}
