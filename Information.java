package com.lzw.dao.model;

public class Information {

	public String name;
	public String tel;
	public void getInformation(String name,String tel) {
		this.name=name;
		this.name=tel;
	}
	public String getTrueName() {
		return this.name;
	}
	public String getMobile() {
		return this.tel;
	}
	
}
