package com.lifejourney.Model;

public class Filereponse {
	String fileName;
	String message;
	public Filereponse(String fileName2, String messgae) {
	this.fileName=fileName2;
	this.message=messgae;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
