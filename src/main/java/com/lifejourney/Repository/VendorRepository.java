package com.lifejourney.Repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lifejourney.Model.User;
import com.lifejourney.Model.Vendor;
@Repository
public interface VendorRepository  extends JpaRepository<Vendor, String>
{

	@Query(value = "SELECT * FROM vendor WHERE v_email= ? and v_password= ?", nativeQuery = true)
	public Vendor findbyEmailandPassword(String v_email,String v_password);

	@Query(value = "select ve.*, ev.event_name from vendor ve join services se on (ve.service_name=se.service_name) join events ev on(se.event_id=ev.id) join religion re on (re.id=se.religion_id) left join orders od on(ve.vendor_id=od.vendor_id)  where re.name=? and ev.event_name=? and se.service_name=? and od.date <>? group by vendor_id;",nativeQuery = true)
	public List<Vendor> findbyReligionEventServiceDate(String name,String event_name,String service_name,Date date );

	@Query(value = "select ve.* from vendor ve join orders od on(ve.vendor_id=od.vendor_id);  ",nativeQuery = true)
	public List<Vendor> findby(String vendor_id);

}


