package com.cinema.dao;

import java.sql.SQLException;
import java.util.List;

import com.cinema.entity.Role;
import com.cinema.entity.User;

public interface RoleDao {
	
	List<Role> findByUser(User user) throws SQLException;
	
}