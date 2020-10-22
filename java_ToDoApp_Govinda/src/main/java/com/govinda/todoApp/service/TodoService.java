package com.govinda.todoApp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.govinda.todoApp.dao.TodoDao;


@Service
public class TodoService {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	TodoDao todoDaoRepo;
	
	
	

}
