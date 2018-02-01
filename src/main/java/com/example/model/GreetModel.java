package com.example.model;

public class GreetModel {
	
	GreetModel(){
		
	}
	
	GreetModel(String msg, Integer len){
		this.msg=msg;
		this.length=len;
	}
	
	private String msg;
	
	private Integer length;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}
    
}
