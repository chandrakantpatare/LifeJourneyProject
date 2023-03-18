package com.lifejourney.Service.OrderService;

import java.sql.Date;

import java.util.List;

import com.lifejourney.Model.Orders;
import com.lifejourney.Model.User;
import com.lifejourney.Model.Vendor;


public interface OrderService {
	
	public Orders saveOrder(Orders order);
	public String deleteOrder(String order_id);
	public Orders updateOrder(Orders order);
	public Orders getOrder(String order_id);
	public List<Orders> findOrderByUser_id(String user_id);
	public List<Orders> findOrderByVendor_id(String vendor_id);
	//public Orders createorder(String amount,Date date,User user, Vendor vendor );
	public List<Orders> fetchAll();

}
