package com.lifejourney.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.lifejourney.DTO.VendorDTO;
import com.lifejourney.Model.Events;
import com.lifejourney.Model.Filereponse;
import com.lifejourney.Model.Orders;
import com.lifejourney.Model.Religion;
import com.lifejourney.Model.User;
import com.lifejourney.Model.Vendor;
import com.lifejourney.Service.FileService;
import com.lifejourney.Service.VendorService.VendorService;

@RestController
@CrossOrigin (origins = "http://localhost:3000")
public class VendorController {
	@Autowired
	FileService fileService;
	
	@Autowired
	private VendorService vendorService;
	
	
	@PostMapping("/upload")
	public ResponseEntity<Filereponse> fileUpload(@RequestParam("image") MultipartFile image)
	{
		 String path="E:\\cdac\\project\\Life Journey\\lifejourney\\public\\images";
		String fileName = null;
		try {
			fileName = fileService.uploadImage(path, image);
				} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 return new ResponseEntity<Filereponse>(new Filereponse(fileName,"Image is not uploaded "),HttpStatus.OK);
		}
		 return new ResponseEntity<Filereponse>(new Filereponse(fileName,"Image is uploaded successfully"),HttpStatus.OK);
			
		
	}
	
	
	
	@PostMapping("/createvendor")
	public Vendor saveVendor(@RequestBody Vendor vendor)
	{
		Vendor result=vendorService.saveVendor(vendor);
		
		return result;}
	
	@GetMapping("/getvendors")
	public Iterable<Vendor> getVendor(){
		return vendorService.fetchAll();
	}
	
	@DeleteMapping("/deletevendor/{vendor_id}")
	public String deleteUser(@PathVariable("vendor_id") String vendor_id)
	{
		vendorService.deleteVendor(vendor_id);
		return "deleted user sucessfully";
	}
	
	@PostMapping("/getvendorlist")
	public Iterable<?> findbyReligionEventServiceDate(@RequestBody VendorDTO vendorDTO){
		return vendorService.findbyReligionEventServiceDate(vendorDTO.getName(), vendorDTO.getEvent_name(), vendorDTO.getService_name(), vendorDTO.getDate());
}
	
}
