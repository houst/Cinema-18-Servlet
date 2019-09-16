package com.cinema.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cinema.dao.DaoFactory;
import com.cinema.dao.UserDao;
import com.cinema.entity.User;

import exception.EmailExistsException;
import exception.EmailNotFoundException;

public class UserService {
	
	private UserDao repo = DaoFactory.getInstance().createUserDao();
	
	public User findByEmail(String email) throws EmailNotFoundException {
		try {
			return repo.findByEmail(email);
		} catch (SQLException e) {
			throw new EmailNotFoundException("There is no user with this email: " + email);
		}
	}

	public User create(User newUser) throws EmailExistsException {
		try {
			return repo.create(newUser);
		} catch (SQLException e) {
			throw new EmailExistsException("There is already exists user with this email: " + newUser.getEmail());
		}
	}

	public List<User> findAllUsers(int page, int size) {
		try {
			return repo.findAllUsers(page, size);
		} catch (SQLException e) {
			return new ArrayList<>();
		}
	}

	public long findCount() {
		try {
			return repo.findCount();
		} catch (SQLException e) {
			return 0;
		}
	}
	
}