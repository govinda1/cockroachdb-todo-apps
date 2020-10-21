package com.govinda.todoApp.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class TodoDao implements Dao<ToDo> {
	
	private List<ToDo> todoList = new ArrayList<ToDo>();

	@Override
	public Optional<ToDo> getId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<ToDo> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int create(ToDo t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(ToDo t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ToDo t) {
		// TODO Auto-generated method stub
		
	}

}
