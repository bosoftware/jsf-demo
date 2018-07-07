/**
 * Copyright Bo Software.
 */
package com.bosoftware.jsf.demo.view.service;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.bosoftware.jsf.demo.ejb.UserEjbRemote;
import com.bosoftware.jsf.demo.entity.User;

/**
 * @author Bo Wang
 *
 *         7 Jul. 2018
 */
@ManagedBean(name = "userService", eager = true)
@ApplicationScoped
public class UserService {

	@EJB
	UserEjbRemote userEjb;

	public List<User> getUserList() {
		return userEjb.getUsers();
	}

}
