/**
 * Copyright Bo Software.
 */
package com.bosoftware.jsf.demo.ejb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.bosoftware.jsf.demo.entity.User;

/**
 * @author Bo Wang
 *
 *         7 Jul. 2018
 */
@Stateless
public class UserEjb implements UserEjbRemote {

	@PersistenceContext(unitName = "admin-hsqldb")
	private EntityManager entityManager;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bosoftware.jsf.demo.ejb.UserServiceRemote#getUsers()
	 */
	@SuppressWarnings("unchecked")
	public List<User> getUsers() {
		List<User> userList = entityManager.createNamedQuery(User.QUERY_FINDALL).getResultList();

		return userList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bosoftware.jsf.demo.ejb.UserServiceRemote#isLoginSucess()
	 */
	@SuppressWarnings("unchecked")
	public boolean isLoginSucess(String loginId, String password) {
		List<User> userList = entityManager.createNamedQuery(User.QUERY_FIND_LOGINID_PASSWORD)
				.setParameter("userId", loginId).setParameter("password", password).getResultList();
		if (userList == null || userList.isEmpty()) {
			return false;
		} else {
			return true;
		}

	}

	@PostConstruct
	public void init() {
		List<User> userList = getUsers();
		if (userList == null || userList.isEmpty()) {
			User user = new User();
			user.setUserId("admin");
			user.setPassword("admin");
			user.setUserName("admin");
			entityManager.persist(user);
		}
	}
}
