package com.learning.spring.learnspringframework.enterprise.example.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MyDataSerivce {
	
	public List<Integer> getDataFromDataService(){
		return Arrays.asList(10,20,30,40);
	}
}
