package com.learning.spring.learnspringframework.enterprise.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.learning.spring.learnspringframework.enterprise.example.business.MyBusinessSerivce;

@Component
public class MyWebController {
	
	@Autowired
	MyBusinessSerivce businessSerivce;
	
	public Integer getValueFromBusinessService() {
		return businessSerivce.calculateSum();
	}
}



