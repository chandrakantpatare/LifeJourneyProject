package com.lifejourney.Repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lifejourney.Model.Orders;
import com.lifejourney.Model.User;
import com.lifejourney.Model.Vendor;


public interface OrderRepository extends JpaRepository<Orders, String> {
	
//	@Query(value = "insert into orders values(?,?,?,?,)",nativeQuery = true)
//	public Orders createorder(String amount,Date date,User user,Vendor vendor );
	
	
	@Query(value = "select od.* from orders od join user us on(od.user_id=us.user_id) where us.user_id=?",nativeQuery = true)
	public List<Orders> findOrderByUserId(String user_id);
	@Query(value = "select od.* from orders od join vendor ve on(od.vendor_id=ve.vendor_id) where od.vendor_id=?",nativeQuery = true)
	public List<Orders> findOrderByVendorId(String vendor_id);
}
