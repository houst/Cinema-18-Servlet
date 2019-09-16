package com.cinema.dao;

import java.sql.SQLException;
import java.util.List;

import com.cinema.entity.User;

public interface UserDao {
	
	User create(User user) throws SQLException;

	User findByEmail(String email) throws SQLException;

	List<User> findAllUsers(int page, int size) throws SQLException;
	
	long findCount() throws SQLException;
    
//	void update(User user);
    
//	void delete(int id);
	
}