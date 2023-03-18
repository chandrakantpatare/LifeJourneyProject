package com.lifejourney.Service.OrderService;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifejourney.Model.Orders;
import com.lifejourney.Model.User;
import com.lifejourney.Model.Vendor;
import com.lifejourney.Repository.OrderRepository;

@Service
public class OrderServiceImplementation implements OrderService {

	
	@Autowired 
	private OrderRepository orderRepository;
	@Override
	public Orders saveOrder(Orders order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}

	@Override
	public String deleteOrder(String order_id) {
		orderRepository.deleteById(order_id);
		return "";
	}

	@Override
	public Orders updateOrder(Orders order) {
		
		return orderRepository.save(order);
	}

	@Override
	public Orders getOrder(String order_id) {
		Optional<Orders> opt=orderRepository.findById(order_id);
		return opt.get();
	}

	@Override
	public List<Orders> fetchAll() {
		// TODO Auto-generated method stub
		return (List<Orders>)orderRepository.findAll();
	}

	@Override
	public List<Orders> findOrderByUser_id(String user_id) {
		// TODO Auto-generated method stub
		return orderRepository.findOrderByUserId(user_id);
	}

	@Override
	public List<Orders> findOrderByVendor_id(String vendor_id) {
		// TODO Auto-generated method stub
		return orderRepository.findOrderByVendorId(vendor_id);
	}

//	@Override
//	public Orders createorder(String amount, Date date, User user, Vendor vendor) {
//		// TODO Auto-generated method stub
//		return orderRepository.createorder(amount, date, user, vendor);
//	}

	

}
