package com.govinda.todoApp.dao;

import java.util.Collection;
import java.util.Optional;

public interface Dao<T> {
	
	Optional<T> getId(int id);
	Collection<T> getAll();
	int create (T t);
	void update(T t);
	void delete(T t);
	
}
