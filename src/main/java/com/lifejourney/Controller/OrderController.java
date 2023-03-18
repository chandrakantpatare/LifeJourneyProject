package com.lifejourney.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lifejourney.DTO.OrderDTO;
import com.lifejourney.DTO.VendorDTO;
import com.lifejourney.Model.Orders;
import com.lifejourney.Model.User;
import com.lifejourney.Service.OrderService.OrderService;
import com.lifejourney.Service.UserService.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class OrderController {
	@Autowired
	private OrderService orderservice;
	
	
	@PostMapping("/createorder")
	public Orders saveUser(@RequestBody Orders order)
	{
		//Orders result=orderservice.createorder(orderDTO.getAmount(),orderDTO.getDate(),orderDTO.getUser(),orderDTO.getVendor());
		Orders result=orderservice.saveOrder(order);
		return result;}
	
	@DeleteMapping("/deleteorder/{order_id}")
	public String deleteOrder(String order_id)
	{
		orderservice.deleteOrder(order_id);
		return "deleted user sucessfully"+order_id;
	}
	
	@PutMapping("/updateorder")
	public Orders updateOrder(@RequestBody Orders order)
	{
		return orderservice.updateOrder(order) ;
	}

	@GetMapping("/getorders")
	public Iterable<Orders> getOrders(){
		return orderservice.fetchAll();
	}
	@PostMapping("/getuserorder/{user_id}")
	public List<Orders>findOrderByUser(@PathVariable ("user_id")String user_id){
		return orderservice.findOrderByUser_id(user_id);			
	}
	@PostMapping("/getvendororder/{vendor_id}")
	public List<Orders>findOrderByVendor(@PathVariable ("vendor_id")String vendor_id){
		return orderservice.findOrderByVendor_id(vendor_id);			
	}
}
