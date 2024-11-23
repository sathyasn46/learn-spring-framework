package com.learning.spring.learnspringframework.enterprise.example.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.learning.spring.learnspringframework.enterprise.example.data.MyDataSerivce;

@Component
public class MyBusinessSerivce {
	
	@Autowired
	MyDataSerivce myDataService;

	public Integer calculateSum() {
		List<Integer> dataList = myDataService.getDataFromDataService();
		return dataList.stream().reduce(Integer::sum).get();
	}
	
}

