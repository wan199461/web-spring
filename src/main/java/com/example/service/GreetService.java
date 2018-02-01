package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;
import com.example.model.GreetModel;

@Repository
public class GreetService {
	
	@Autowired
	private GreetModel greetModel;
	
	public void greet(){
		System.out.println("Hello");
//		org.springframework.web.context.ContextLoaderListener li=new org.springframework.web.context.ContextLoaderListener();
	}
	
	public void doGreetModel(){
		System.out.println(JSON.toJSONString(greetModel));
    }
}
