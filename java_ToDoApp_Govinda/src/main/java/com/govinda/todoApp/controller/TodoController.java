package com.govinda.todoApp.controller;

 

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.govinda.todoApp.dao.ToDo;
import com.govinda.todoApp.dao.TodoDao;

@RestController 
public class TodoController {
 
	@Autowired
	private TodoDao todoApp;
	
	@GetMapping("/todo")
	Collection<ToDo> getAllTodo(){
		return todoApp.getAll();
	}
	
	
	

}
