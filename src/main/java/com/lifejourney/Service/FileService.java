package com.lifejourney.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {

	public String uploadImage(String path, MultipartFile file) throws IOException {
		
		String name=file.getOriginalFilename();
		String filepath=path+File.separator+name;
		
		File file1=new File(path);
		if(!file1.exists()) {
			file1.mkdir();
		}
		
		Files.copy(file.getInputStream(), Paths.get(filepath));
		return name;
	} 
	
	
	
}
