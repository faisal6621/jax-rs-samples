package com.faisal.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Singleton;

import com.faisal.bean.User;

@Singleton
public class UsersUtil {

	private List<User> users;

	public UsersUtil() {
		this.users = new ArrayList<>();
	}

	public void addUser(User user) {
		users.add(user);
	}

	public void removeUser(User user) {
		users.remove(user);
	}

	public User getUser(String name) {
		User user = null;
		Optional<User> opUser = users.stream().filter(u -> name.equals(u.getName())).findFirst();
		if (opUser.isPresent()) {
			user = opUser.get();
		}
		return user;
	}

	public List<User> getUsers() {
		return users;
	}

	@Override
	public String toString() {
		return "UsersUtil [users=" + users + "]";
	}

}
