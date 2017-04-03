package com.viz.service;

import java.util.ArrayList;
import java.util.List;

import com.viz.beans.UserBean;
import com.viz.util.ConnectionManager;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.ResponseList;
import facebook4j.User;

public class UserService {
	public static List<UserBean> getUsers(String searchText) {
		Facebook fb=ConnectionManager.getConnection();
		try {
			List<UserBean> users=new ArrayList<UserBean>();
			ResponseList<User> results=fb.searchUsers(searchText);
			UserBean user = null;
			for(User fbUser : results) {
				user = new UserBean(fbUser.getName(), fbUser.getEmail(), fbUser.getId());
				users.add(user);
			}
			return users;
		} catch (FacebookException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}
